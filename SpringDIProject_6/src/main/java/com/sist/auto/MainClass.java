package com.sist.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
/*
 *   POJO ��� �ַ� ���
 *   : �Ϲ� �ڹ� => �������̽�, ��� X => ������ Ŭ����
 */
// �������� ����� �� autowired
@Component
public class MainClass {
	// �ǹ�(1.8���� ����) => @Autowired+@Qualifier = @Resource
	@Autowired
	@Qualifier(value = "oracle")
	// �浹���� �ʵ��� Ŭ���� ����(ù ���� �ҹ���)
	private DAO dao;
	//Oracle , MySQL �� � ���� ������� �浹��
	
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("app2.xml");
		
		MainClass mc=(MainClass)app.getBean("mainClass");
		mc.dao.connection();
	}
}
