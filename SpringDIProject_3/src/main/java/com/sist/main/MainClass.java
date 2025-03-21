package com.sist.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");
		EmpDAO dao=(EmpDAO)app.getBean("dao");
		// EmpDAO dao=new EmpDAO() => 아예 새로운 객체를 만들어버리니 정보를 얻어오지 못함 => new 사용 x
		List<EmpVO> list=dao.empListData();
		for(EmpVO vo:list)
		{
			System.out.println(vo.getEname()+" "+vo.getDbday()+" "+vo.getJob());
		}
	}

}
