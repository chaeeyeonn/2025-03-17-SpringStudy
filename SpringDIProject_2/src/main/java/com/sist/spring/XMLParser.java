package com.sist.spring;
import java.lang.reflect.Method;
import java.util.*;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
/*
 * 	XML �Ľ�
 *   - DOM: �ӵ��� ������ => �޸𸮿� Ʈ������ ���� / CRUD
 *   - SAX: MyBatis / Spring
 *   	  : �ӵ��� ������ => �±��� ��, �Ӽ����� ����
 *   
 *   	    �̺�Ʈ �߻�
 *   		<?xml version="1.0" encoding="UTF-8"?> => startDocument()
			<beans> => startElement()
			 <bean id="sa" class="com.sist.spring.Sawon"> => startElement()
			 	<property name="name" value="ȫ�浿"/> => endElement()
			 	<property name="sex" value="����"/> => endElement()
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
			if(qName.equals("bean")) // �޸𸮸� ���� �Ҵ��ؾ� �Ѵ�
			{
				String id=attributes.getValue("id"); // �Ӽ��� �б�
				String cls=attributes.getValue("class");
				clsName=Class.forName(cls);
				clsMap.put(id, obj);// Object�� ��� ���������� �����Ƿ� obj�� �ޱ�
									// ���ÿ��� �ݵ�� ����ȯ �ʿ�
			}
			// DI => setter DI
			if(qName.equals("property"))
			{
				String name=attributes.getValue("name");
				String value=attributes.getValue("value");
				// Method ȣ�� => setName setSex setAge
				Method[] methods=clsName.getDeclaredMethods();
				for(Method m:methods)
				{
					if(m.getName().equalsIgnoreCase("set"+name))
					{              // ��ҹ��� ���о��� ã�ƶ�
						if(name.equals("age"))
						{
							m.invoke(obj, Integer.parseInt(value));
						}
						else
						{
							m.invoke(obj, value);
							//sa.setXxx("ȫ�浿")
						}
					}
				}
			}
		}catch(Exception ex) {}
	}
	
	
}
