package com.sist.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *   XML / Annotation => Ŭ������ ��Ƽ� ����
 *   => Ŭ���� ��Ͻ�
 *   	1) ����� ������ �ִ� Ŭ����(������Ʈ): DAO / Manager / Service / Model
 *   				     		(VO,DTO,Bean: ����� ���������̶� x)
 *      2) ��� ���
 *         <bean id="" class="">: �޸� �Ҵ� �Ŀ� ����(default ������ ȣ��)
 *         => singleton: �� ���� �޸𸮷� ����(default)
 *         => ���� �� ������: prototype => �޸� �����Ͽ� ���ο� �޸� ����
 *         	  <bean id="" class="" scope="">
 *         		=> Object clone()
 *         => id�� Ŭ������ ã�� ���� ������ => �ݵ�� �ߺ����� ����
 *         => �����̳� �ȿ� ����(������ ����)
 *         					BeanFactory: core(DI, ��ü ����/�Ҹ�)
 *         					    |
 *         				ApplicationContext: +AOP, ����ȭ
 *         				------------------XML�� ��ϵ� ���
 *         				AnnotationConfigApplicationContext: �ڹٷ� ����(����)/ 5���� �̻� ����
 *         						|
 *         				WebApplicationContext: +MVC(WEB) => Controller ����(dispatcherServlet)
 *         																  -------------------ó�� �޼ҵ� ã��
 *         																	@RequestMapping: GET/POST ���� ó��
 *         																	@GetMapping
 *         																	@PostMapping
 *     
 *    ***Spring���� ����
 *      - DI => 70%�̻� ����
 *      - AOP => �ݺ� ����(���� ����� Ŭ����)
 *      - ORM => �����ͺ��̽� ����(MyBatis,JPA,Hibernate)
 *      - MVC
 *      - Security
 *      
 *   1. DI
 *      --IoC => DI
 *        ---������ ����(��ƾ�Ŀ﷯) => AI
 *        ����: Ŭ������ Ŭ���� ���� ���� ���� ����(Ŭ���� ���̾�׷�)
 *        	   => p:��ü��-ref="id��"
 *        	   Ŭ������ �ʿ��� ������ ����
 *        	   => p:������="��"
 *        		  ----------
 *        		  setter / constructor
 *        		  --------------------XML�� ����(������̼� �Ұ�)
 *     Ŭ���� �� �� �޸� �Ҵ�:<bean>
 *     Ŭ���� ���� �� �� ���� �޸� �Ҵ�
 *     :<context:component-scan basepackage="">
 *     => �����ؼ� �޸� �Ҵ� ��û
 *     		    ------------�޸𸮿� �Ҵ�� ��ü�� �������� ����
 *     	  @Controller: Model Ŭ���� / ��ûó��
 *        @Component: �Ϲ� Ŭ���� => MainClass..
 *        @Repository: ����� => DAO
 *        @Service: BI => ����(DAO ���� ���� �� ���� ���ս� �ַ� ���)
 *        @RestController: �ٸ� ���α׷� ����
 *        				   -------------�ڹٽ�ũ��Ʈ(JSON) => web
 *        								--------------
 *        				             	|VueJS
 *        @ControllerAdvice: ���� ����ó��
 *        @RestControllerAdvice: ���� ����ó��
 *        @Bean: �ڹٷ� Ŭ���� ������(<bean>)
 *        ---------------------------------------------------------
 *        1) Ŭ������ �� ���� <bean> => XML
 *        2) ��� Ŭ������ �� ���� ���: ��Ű�� ���� => Annotation
 *        3) XML + Annotation: �ǹ�
 */
import com.sist.goods.*;
import com.sist.member.*;
import com.sist.sawon.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����� XML�� �����̳ʷ� ����
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");
		//Ŭ���� ã�� => Ȱ��
		SawonManager  sa=(SawonManager)app.getBean("sa");
		sa.display();
		MemberManager mem=(MemberManager)app.getBean("mem");
		mem.display();
		GoodsManager goods=(GoodsManager)app.getBean("goods");
		goods.display();
	}

}
