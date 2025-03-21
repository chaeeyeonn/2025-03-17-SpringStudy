package com.sist.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//application-datasource.xml 대체
/*
 * <bean id="ds" class="org.apache.commons.dbcp.BasicDataSource"
		p:driverClassName="oracle.jdbc.driver.OracleDriver"
		p:url="jdbc:oracle:thin:@localhost:1521:XE"
		p:username="hr"
		p:password="happy"
	/>
	<!-- MyBatis 연동: SqlSessionFactory: 오라클 연결/해제 -->
	<bean id="ssf" class="org.mybatis.spring.SqlSessionFactoryBean"
		p:dataSource-ref="ds"
	/>
	<!-- Mapper 구현: MapperFactoryBean: SQL문장 읽어서 전송/결과값 -->
	<mybatis-spring:scan base-package="com.sist.mapper" factory-ref="ssf"/>
	=> @MapperScan(basePackages = "com.sist.mapper")
	클래스 위에 두기 @Target(value={TYPE})
 */
@Configuration
@MapperScan(basePackages = "com.sist.mapper")
public class DatabaseConfig {
/*
 * <bean id="ds" class="org.apache.commons.dbcp.BasicDataSource"
		p:driverClassName="oracle.jdbc.driver.OracleDriver"
		p:url="jdbc:oracle:thin:@localhost:1521:XE"
		p:username="hr"
		p:password="happy"
	/>
 */
	@Bean("ds")
	public DataSource dataSource()
	{
		BasicDataSource ds=new BasicDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		ds.setUsername("hr");
		ds.setPassword("happy");
		return ds;
	}
	/*
	 * <!-- MyBatis 연동: SqlSessionFactory: 오라클 연결/해제 -->
	<bean id="ssf" class="org.mybatis.spring.SqlSessionFactoryBean"
		p:dataSource-ref="ds"
	/>
	 */
	@Bean("ssf")
	public SqlSessionFactory sqlSessionFactory() throws Throwable
	{
		SqlSessionFactoryBean ssf=new SqlSessionFactoryBean();
		ssf.setDataSource(dataSource());
		return ssf.getObject();
		//interface때문에 sqlsessionfactory를 생성하지 못함 => 리턴도 getObject로
		//SqlSessionFactoryBean: SqlSessionFactory 구현 메소드
		//getObject => 예외처리 필요 throwable => Exception 최상위 클래스
	}
}
