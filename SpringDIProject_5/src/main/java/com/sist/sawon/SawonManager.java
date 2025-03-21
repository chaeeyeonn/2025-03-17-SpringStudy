package com.sist.sawon;

import org.springframework.stereotype.Component;
// <bean id="sa" class="com.sist.sawon.SawonManager"/> ¿Í °°À½
@Component("sa")
public class SawonManager {
	public void display()
	{
		System.out.println("SawonManager:display() Call...");
	}
}
