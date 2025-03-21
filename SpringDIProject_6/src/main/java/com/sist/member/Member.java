package com.sist.member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sist.sawon.*;
// component
// Target(value={TYPE})
@Component("mem")
public class Member {
	@Autowired
	// �������� ����� ��ü�� ã�ƿ� (@component)
	// private ���� ����
	/*
	 * Target(value={CONSTRUCTOR, METHOD, PARAMETER, FIELD, ANNOTATION_TYPE})
	 */
	private Sawon sawon;// sawon�� ��ü�� ã�� �ּҰ� ����
	
	public void display()
	{
		System.out.println("sawon:"+sawon);
		System.out.println("���:"+sawon.getSabun());
		System.out.println("�̸�:"+sawon.getName());
	}

	public void setSawon(Sawon sawon) {
		this.sawon = sawon;
	}
}
