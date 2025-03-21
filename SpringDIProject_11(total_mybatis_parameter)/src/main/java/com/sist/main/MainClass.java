package com.sist.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.sist.config.FoodConfig;
import com.sist.service.FoodService;
import java.util.*;
import com.sist.vo.*;
@Component("mc")
public class MainClass {
	@Autowired
	private FoodService service;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext app=new ClassPathXmlApplicationContext("application-*.xml");
		AnnotationConfigApplicationContext app=new AnnotationConfigApplicationContext(FoodConfig.class);
		// FoodConfig.class => 실제 Class 가져오기
		
		MainClass mc=(MainClass)app.getBean("mc");
		Scanner scan=new Scanner(System.in);
		System.out.print("페이지 입력:");
		int page=scan.nextInt();
		List<FoodVO> list=mc.service.foodListData((page*10)-9, page*10);
		for(FoodVO vo:list)
		{
			System.out.println(vo.getFno()+"."+vo.getName());
		}
		
	}

}
