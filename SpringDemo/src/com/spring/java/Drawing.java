package com.spring.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {
public static void main(String[] args) {
	//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("Spring.xml"));
	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
	Triangle triangle=(Triangle) context.getBean("triangle");
	triangle.draw();
} 




}
