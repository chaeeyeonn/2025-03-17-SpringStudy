package com.sist.spring;
import java.lang.reflect.Method;
import java.util.*;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
/*
 * 	XML 파싱
 *   - DOM: 속도가 느리다 => 메모리에 트리형식 저장 / CRUD
 *   - SAX: MyBatis / Spring
 *   	  : 속도가 빠르다 => 태그의 값, 속성값만 읽음
 *   
 *   	    이벤트 발생
 *   		<?xml version="1.0" encoding="UTF-8"?> => startDocument()
			<beans> => startElement()
			 <bean id="sa" class="com.sist.spring.Sawon"> => startElement()
			 	<property name="name" value="홍길동"/> => endElement()
			 	<property name="sex" value="남자"/> => endElement()
			 	<property name="age" value="25"/> => endElement()
			 </bean> => endElement()
			</beans> => endElement()
			=> endDocument()
 */
public class XMLParser extends DefaultHandler{
	Map clsMap=new HashMap();
	Object obj;
	Class clsName;
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		try
		{
			if(qName.equals("bean")) // 메모리를 먼저 할당해야 한다
			{
				String id=attributes.getValue("id"); // 속성값 읽기
				String cls=attributes.getValue("class");
				clsName=Class.forName(cls);
				clsMap.put(id, obj);// Object는 모든 데이터형을 받으므로 obj로 받기
									// 사용시에는 반드시 형변환 필요
			}
			// DI => setter DI
			if(qName.equals("property"))
			{
				String name=attributes.getValue("name");
				String value=attributes.getValue("value");
				// Method 호출 => setName setSex setAge
				Method[] methods=clsName.getDeclaredMethods();
				for(Method m:methods)
				{
					if(m.getName().equalsIgnoreCase("set"+name))
					{              // 대소문자 구분없이 찾아라
						if(name.equals("age"))
						{
							m.invoke(obj, Integer.parseInt(value));
						}
						else
						{
							m.invoke(obj, value);
							//sa.setXxx("홍길동")
						}
					}
				}
			}
		}catch(Exception ex) {}
	}
	
	
}
