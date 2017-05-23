package balu.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 
{
	public static void main(String[] args) 
	 {
		ApplicationContext context = new ClassPathXmlApplicationContext("CollectionType/Beans.xml");
		Object ob =(Object)context.getBean("stdObj");
		System.out.println(ob);
     }
}
