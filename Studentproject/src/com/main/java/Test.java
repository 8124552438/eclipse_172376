package com.main.java;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
                                                                                                                                                        
import com.pojo.java.Student;

public class Test {

		public static void main(String[] args)
		{  
		    Resource resource=new ClassPathResource("new.xml");  
		    BeanFactory factory=new XmlBeanFactory(resource);  
		      
		    Student student=(Student)factory.getBean("s1");  
		    student.displayInfo();  
		}  

}

