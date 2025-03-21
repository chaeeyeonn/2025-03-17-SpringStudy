package com.sist.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.goods.*;
import com.sist.member.*;
import com.sist.sawon.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=new ClassPathXmlApplicationContext("app1.xml");
		SawonManager sa=(SawonManager)app.getBean("sa");
		sa.display();
		/*
		 * GoodsManager goods=app.getBean("goods",GoodsManager.class);
		 * goods.display();
		 * => goods는 component 하지 않아 bean을 찾지 못함
		 */
		MemberManager mem=(MemberManager)app.getBean("memberManager");
		// 자동 아이디 => 클래스 이름(첫 자 소문자)
		// 이미 아이디가 있으면 자동 아이디 불가
		mem.display();
	}

}
