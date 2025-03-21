package com.sist.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *   XML / Annotation => 클래스를 모아서 관리
 *   => 클래스 등록시
 *   	1) 기능을 가지고 있는 클래스(컴포넌트): DAO / Manager / Service / Model
 *   				     		(VO,DTO,Bean: 사용자 데이터형이라 x)
 *      2) 등록 방법
 *         <bean id="" class="">: 메모리 할당 후에 저장(default 생성자 호출)
 *         => singleton: 한 개의 메모리로 재사용(default)
 *         => 여러 개 생성시: prototype => 메모리 복제하여 새로운 메모리 생성
 *         	  <bean id="" class="" scope="">
 *         		=> Object clone()
 *         => id는 클래스를 찾기 위한 구분자 => 반드시 중복없이 설정
 *         => 컨테이너 안에 저장(스프링 지원)
 *         					BeanFactory: core(DI, 객체 생성/소멸)
 *         					    |
 *         				ApplicationContext: +AOP, 국제화
 *         				------------------XML로 등록된 경우
 *         				AnnotationConfigApplicationContext: 자바로 설정(보안)/ 5버전 이상 권장
 *         						|
 *         				WebApplicationContext: +MVC(WEB) => Controller 지원(dispatcherServlet)
 *         																  -------------------처리 메소드 찾기
 *         																	@RequestMapping: GET/POST 동시 처리
 *         																	@GetMapping
 *         																	@PostMapping
 *     
 *    ***Spring에서 지원
 *      - DI => 70%이상 차지
 *      - AOP => 반복 제거(공통 기반의 클래스)
 *      - ORM => 데이터베이스 연동(MyBatis,JPA,Hibernate)
 *      - MVC
 *      - Security
 *      
 *   1. DI
 *      --IoC => DI
 *        ---제어의 역전(마틴파울러) => AI
 *        범위: 클래스와 클래스 간의 연관 관계 설정(클래스 다이어그램)
 *        	   => p:객체명-ref="id명"
 *        	   클래스에 필요한 데이터 주입
 *        	   => p:변수명="값"
 *        		  ----------
 *        		  setter / constructor
 *        		  --------------------XML만 가능(어노테이션 불가)
 *     클래스 한 개 메모리 할당:<bean>
 *     클래스 여러 개 한 번에 메모리 할당
 *     :<context:component-scan basepackage="">
 *     => 선별해서 메모리 할당 요청
 *     		    ------------메모리에 할당된 객체만 스프링이 관리
 *     	  @Controller: Model 클래스 / 요청처리
 *        @Component: 일반 클래스 => MainClass..
 *        @Repository: 저장소 => DAO
 *        @Service: BI => 통합(DAO 여러 개를 한 번에 통합시 주로 사용)
 *        @RestController: 다른 프로그램 연동
 *        				   -------------자바스크립트(JSON) => web
 *        								--------------
 *        				             	|VueJS
 *        @ControllerAdvice: 공통 예외처리
 *        @RestControllerAdvice: 공통 예외처리
 *        @Bean: 자바로 클래스 설정시(<bean>)
 *        ---------------------------------------------------------
 *        1) 클래스를 한 개씩 <bean> => XML
 *        2) 모든 클래스를 한 번에 등록: 패키지 단위 => Annotation
 *        3) XML + Annotation: 실무
 */
import com.sist.goods.*;
import com.sist.member.*;
import com.sist.sawon.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 등록한 XML을 컨테이너로 전송
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");
		//클래스 찾기 => 활용
		SawonManager  sa=(SawonManager)app.getBean("sa");
		sa.display();
		MemberManager mem=(MemberManager)app.getBean("mem");
		mem.display();
		GoodsManager goods=(GoodsManager)app.getBean("goods");
		goods.display();
	}

}
