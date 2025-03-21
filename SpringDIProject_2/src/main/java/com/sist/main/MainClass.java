package com.sist.main;
/*
 *   스프링 
 *   => 클래스 관리영역
 *   	--------
 *   	Container Class
 *     => BeanFactory
 *     		   |
 *     	 ApplicationContext => XML 클래스 등록
 *     		   |  - AnnotationConfigApplicationContext
 *     				=> 자바로 등록 => 5버전 이상에서 권장(보안)
 *     	WebApplicationContext
 *     
 *     ** Component: 클래스 한 개(기능을 가지고 있는 클래스)
 *     				 JButton / JTextField
 *     				 ~Model / ~Manager / ~DAO => 부품에 해당
 *     				 => CPU / 메모리 / 하드디스크 ...
 *     ** Container: 조립자(클래스 관리 영역)
 *     		  |   	=> 메인보드
 *        클래스 관리
 *        --------
 *        1) 객체 생성
 *           <bean id="a" class="com.sist.main.A">
 *            => Class clsName=Class.forName("conm.sist.main.A")
 *            	 Object obj=clsName.newInstance()
 *            	 => map.put("a".obj) => 대기 상태
 *        2) 생성시에 멤버변수에 대한 초기화: DI
 *        	 - setXxx() => setter DI
 *        	 - 생성자 매개변수 => constructor DI
 *        	 - 생성 / 소멸 시 메소드 호출 => method DI
 *        3) 객체 찾기 => DL => getBean()
 *        4) 객체 소멸
 *        
 *        클래스 등록 / DI
 *        1) XML: 공통 사용 부분, 이미 태그가 만들어져 있음(속성 존재) => DTD/스키마
 *        2) Annotation: 개별 사용 부분, 이미 만들어져 있음 => @Controller / @RequestMapping
 *        3) XML+Annotation => 웹 / 실무 시 사용
 *        	 --- ----------
 *           |       | 사용자 정의 클래스
 *     프로젝트에서 공통 사용되는 부분
 *     라이브러리 클래스: MyBatis / Transaction
 *     => 공통으로 사용되는 클래스나 메소드를 모아서 관리: 공통 모듈
 *     (com.sist.commons => 자동 호출 가능 => AOP)
 *     => 웹 => MVC
 *     	  (추가: Task, Security, Batch, SI, Spring-Data)
 *     
 *     프레임워크 VS 라이브러리
 *     - 프레임워크: 레고(내 방식대로 조립할 수 있다)
 *     		      기본 동작을 위한 틀이 만들어져 있다 => 형식(XML/Annotation)에 맞추어 세팅 후 사용 가능
 *     - 라이브러리: 완제품(주어진대로 사용해야 한다)
 *     
 *     스프링에서 재공하는 라이브러리
 *     - spring-core: Container/DI
 *     - spring-aop: AOP => 공통모듈
 *     - spring-orm: MyBatis / JPA
 *     - spring-dao: JDBC(실무에선 x)
 *     - spring-web/spring-webmvc
 *     
 *     스프링 사용 목적
 *     - 생산성: 라이브러리가 뛰어나다 / 신뢰성이 좋다 / 빠른 개발 가능
 *     - 유지보수 용이 / 확장성이 뛰어나다: 다른 프로그램 언어와 연동 가능
 *     - 무료 / 자유로운 수정 가능
 *     - *** 현재 기술에 맞게 라이브러리 제작되고 있다
 *     		 -------AI, MSA, ...
 *     			  
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
