package com.sist.member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sist.sawon.*;
// component
// Target(value={TYPE})
@Component("mem")
public class Member {
	@Autowired
	// 스프링에 저장된 객체만 찾아옴 (@component)
	// private 접근 가능
	/*
	 * Target(value={CONSTRUCTOR, METHOD, PARAMETER, FIELD, ANNOTATION_TYPE})
	 */
	private Sawon sawon;// sawon의 객체를 찾아 주소값 대입
	
	public void display()
	{
		System.out.println("sawon:"+sawon);
		System.out.println("사번:"+sawon.getSabun());
		System.out.println("이름:"+sawon.getName());
	}

	public void setSawon(Sawon sawon) {
		this.sawon = sawon;
	}
}
