package com.sist.main;

import org.apache.commons.dbcp.BasicDataSource;

/*
 * <bean id="ds" class="org.apache.commons.dbcp.BasicDataSource"
	 	p:driverClassName="oracle.jdbc.driver.OracleDirver"
	 	p:url="jdbc:oracle:thin:@localhost:1521:XE"
	 	p:username="hr"
	 	p:password="happy"
 */
/*
 *  map.put("ds",new MyDataSource())
 *  		     ------------------getBean("ds")
 */
/*
 */
public class MyBasicDataSource extends BasicDataSource{
	public MyBasicDataSource()
	{
		setDriverClassName("oracle.jdbc.driver.OracleDirver");
		setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		setUsername("hr");
		setPassword("happy");
	}
}
