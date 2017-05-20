package balu.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
public static void main(String[] args) 
  {
	//Create Context Object
	ApplicationContext context=new ClassPathXmlApplicationContext("balu/app/Beans.xml");
	// get bean from Context
	Object ob=context.getBean("empObj");
	// down cast and use
	if(ob instanceof Employee)
	{
		Employee emp=(Employee)ob;
		System.out.println(emp);
	}
  }
}
