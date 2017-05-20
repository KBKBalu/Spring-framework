package balu.app;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("CollectionType/Config.xml");
		Object ob=context.getBean("empObj");
		Employee1 emp=(Employee1)ob;
		
		//Printing list in Different Ways
		
		List<String> list=emp.getData();
		//1. Println-toString
		System.out.println(list);
		System.out.println("-----------------");
		
		//2.For each loop
		for(String s:list)
		{
			System.out.println(s);
		}
		System.out.println("=================");
		
		//3.Iterator
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			String str=itr.next();
			System.out.println(str);
			if(str.equals("KBK"))
				itr.remove(); //Valid
			
		}
		System.out.println("++++++++++++++++++++");
		
		//4.List Iterator
		ListIterator<String> itr2=list.listIterator();
		while(itr2.hasNext())
		{
			String str=itr2.next();
			System.out.println(str);
		}
		System.out.println("-----------Reverse------------");
	while(itr2.hasPrevious())
	{
		String str=(String)itr2.previous();
		System.out.println(str);
		
	}
	System.out.println("****************************");
   
	//5.Array Format
	Object[] arr=list.toArray();
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
  }

}
