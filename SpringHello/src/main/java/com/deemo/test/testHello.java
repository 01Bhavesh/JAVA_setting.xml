package com.deemo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.HelloSpring;

public class testHello {
public static void main(String[] args)
{
//	BeanFactory bc = new XmlBeanFactory(new ClassPathResource("SpringConfig.xml")); // after calling getBean only then default constructor get called
	ApplicationContext clr = new ClassPathXmlApplicationContext("SpringConfig.xml");//default constructor get call automatically
	System.out.println("before");
	//HelloSpring hello = (HelloSpring) clr.getBean("hw");
	//System.out.println(hello.Show());
	System.out.println("after");
}
}
