package com.sist.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
/*
 *   POJO 방식 주로 사용
 *   : 일반 자바 => 인터페이스, 상속 X => 독립된 클래스
 */
// 스프링에 등록한 후 autowired
@Component
public class MainClass {
	// 실무(1.8버전 이하) => @Autowired+@Qualifier = @Resource
	@Autowired
	@Qualifier(value = "oracle")
	// 충돌나지 않도록 클래스 선택(첫 글자 소문자)
	private DAO dao;
	//Oracle , MySQL 중 어떤 것을 사용할지 충돌남
	
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("app2.xml");
		
		MainClass mc=(MainClass)app.getBean("mainClass");
		mc.dao.connection();
	}
}
