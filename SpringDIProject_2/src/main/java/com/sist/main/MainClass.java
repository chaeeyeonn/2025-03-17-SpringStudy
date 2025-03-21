package com.sist.main;
/*
 *   ������ 
 *   => Ŭ���� ��������
 *   	--------
 *   	Container Class
 *     => BeanFactory
 *     		   |
 *     	 ApplicationContext => XML Ŭ���� ���
 *     		   |  - AnnotationConfigApplicationContext
 *     				=> �ڹٷ� ��� => 5���� �̻󿡼� ����(����)
 *     	WebApplicationContext
 *     
 *     ** Component: Ŭ���� �� ��(����� ������ �ִ� Ŭ����)
 *     				 JButton / JTextField
 *     				 ~Model / ~Manager / ~DAO => ��ǰ�� �ش�
 *     				 => CPU / �޸� / �ϵ��ũ ...
 *     ** Container: ������(Ŭ���� ���� ����)
 *     		  |   	=> ���κ���
 *        Ŭ���� ����
 *        --------
 *        1) ��ü ����
 *           <bean id="a" class="com.sist.main.A">
 *            => Class clsName=Class.forName("conm.sist.main.A")
 *            	 Object obj=clsName.newInstance()
 *            	 => map.put("a".obj) => ��� ����
 *        2) �����ÿ� ��������� ���� �ʱ�ȭ: DI
 *        	 - setXxx() => setter DI
 *        	 - ������ �Ű����� => constructor DI
 *        	 - ���� / �Ҹ� �� �޼ҵ� ȣ�� => method DI
 *        3) ��ü ã�� => DL => getBean()
 *        4) ��ü �Ҹ�
 *        
 *        Ŭ���� ��� / DI
 *        1) XML: ���� ��� �κ�, �̹� �±װ� ������� ����(�Ӽ� ����) => DTD/��Ű��
 *        2) Annotation: ���� ��� �κ�, �̹� ������� ���� => @Controller / @RequestMapping
 *        3) XML+Annotation => �� / �ǹ� �� ���
 *        	 --- ----------
 *           |       | ����� ���� Ŭ����
 *     ������Ʈ���� ���� ���Ǵ� �κ�
 *     ���̺귯�� Ŭ����: MyBatis / Transaction
 *     => �������� ���Ǵ� Ŭ������ �޼ҵ带 ��Ƽ� ����: ���� ���
 *     (com.sist.commons => �ڵ� ȣ�� ���� => AOP)
 *     => �� => MVC
 *     	  (�߰�: Task, Security, Batch, SI, Spring-Data)
 *     
 *     �����ӿ�ũ VS ���̺귯��
 *     - �����ӿ�ũ: ����(�� ��Ĵ�� ������ �� �ִ�)
 *     		      �⺻ ������ ���� Ʋ�� ������� �ִ� => ����(XML/Annotation)�� ���߾� ���� �� ��� ����
 *     - ���̺귯��: ����ǰ(�־������ ����ؾ� �Ѵ�)
 *     
 *     ���������� ����ϴ� ���̺귯��
 *     - spring-core: Container/DI
 *     - spring-aop: AOP => ������
 *     - spring-orm: MyBatis / JPA
 *     - spring-dao: JDBC(�ǹ����� x)
 *     - spring-web/spring-webmvc
 *     
 *     ������ ��� ����
 *     - ���꼺: ���̺귯���� �پ�� / �ŷڼ��� ���� / ���� ���� ����
 *     - �������� ���� / Ȯ�强�� �پ��: �ٸ� ���α׷� ���� ���� ����
 *     - ���� / �����ο� ���� ����
 *     - *** ���� ����� �°� ���̺귯�� ���۵ǰ� �ִ�
 *     		 -------AI, MSA, ...
 *     			  
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
