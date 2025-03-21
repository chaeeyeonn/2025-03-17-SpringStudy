package com.sist.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// application-context.xml 대체
// <context:component-scan base-package="com.sist.*"/> => @ComponentScan
// 클래스 위로 놔야 함 Target(value={TYPE})
// 환경설정용(xml 대체) : @configuration => 스프링 메모리 할당
@Configuration
@ComponentScan(basePackages = "com.sist.*")
public class EmpConfig {
	
}
