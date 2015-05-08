package com.learnjava.springbasics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Employee {

	int id;
	String name;
	
	
	public static void main(String[] args) {
		
		
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("WEB-INF/dispatcher-servlet.xml");
		
		Employee emp = (Employee) appcontext.getBean("employee");
		
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("WEB-INF/dispatcher-servlet.xml"));
		//XmlBeanFactory factory = new XmlBeanFactory
             // (new ClassPathResource("WEB-INF/dispatcher-servlet.xml"));
		Employee emp1 = (Employee) bf.getBean("employee");
		
	}
	
}
