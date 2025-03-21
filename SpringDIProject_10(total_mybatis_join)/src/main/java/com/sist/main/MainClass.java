package com.sist.main;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.sist.config.DatabaseConfig;
import com.sist.config.EmpConfig;
import com.sist.service.*;
import com.sist.vo.*;
@Component
public class MainClass {
	@Autowired
	private EmpDeptService service;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//XML 전송 => 관리
		//ApplicationContext app=new ClassPathXmlApplicationContext("application-*.xml");
		// xml 안 쓰는 방법 => JAVA
		Class[] cls={EmpConfig.class,DatabaseConfig.class};
		AnnotationConfigApplicationContext app=new AnnotationConfigApplicationContext(cls);
		// 클래스를 배열로 잡은 뒤 어노테이션 설정
		MainClass mc=(MainClass)app.getBean("mainClass");
		// getBean("id") => id의 맨 앞은 소문자(자동 id)
		//service 받기 위해 mainclass로 getbean
		List<EmpVO> eList=mc.service.empListData();
		System.out.println("=============사원목록=============");
		for(EmpVO vo:eList)
		{
			System.out.println(vo.getEmpno()+" "+vo.getEname()+" "+vo.getJob()+" "+vo.getDbday()+" "+vo.getSal());
		}
		List<DeptVO> dList=mc.service.deptListData();
		System.out.println("=============부서정보=============");
		for(DeptVO vo:dList)
		{
			System.out.println(vo.getDeptno()+" "+vo.getDname()+" "+vo.getLoc());
		}
		System.out.println("=============Join Data=============");
		List<EmpVO> jList=mc.service.empJoinData();
		for(EmpVO vo:jList)
		{
			System.out.println(vo.getEmpno()+" "+vo.getEname()+" "+vo.getJob()+" "+vo.getDvo().getDname()+" "+vo.getDvo().getLoc()+" "+vo.getSal());
		}
		System.out.println("===============사원 개인정보==============");
		Scanner scan=new Scanner(System.in);
		System.out.print("사번 입력:");
		int empno=scan.nextInt();
		EmpVO vo=mc.service.empDetailData(empno);
		System.out.println("사번:"+vo.getEmpno());
		System.out.println("이름:"+vo.getEname());
		System.out.println("직위:"+vo.getJob());
		//request.setAttribute => 브라우저 전송 => JSP는 변경되지 않음
	}

}
