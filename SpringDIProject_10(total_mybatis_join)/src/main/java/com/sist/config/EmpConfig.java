package com.sist.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// application-context.xml ��ü
// <context:component-scan base-package="com.sist.*"/> => @ComponentScan
// Ŭ���� ���� ���� �� Target(value={TYPE})
// ȯ�漳����(xml ��ü) : @configuration => ������ �޸� �Ҵ�
@Configuration
@ComponentScan(basePackages = "com.sist.*")
public class EmpConfig {
	
}
