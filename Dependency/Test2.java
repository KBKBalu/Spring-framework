package balu.app;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("CollectionType/Config1.xml");
		Object ob = context.getBean("stdObj");
		Student std = (Student) ob;
		Map<String, String> mapData = std.getData();

		// using 1.Println-toString
		System.out.println(mapData);

		
		 // 2.entry Set (map.entry) 
		Set<Entry<String,String>>itr=data.iterator();
		  while(itr.hasNext()) 
		  { 
			  Entry<String,String>entry=itr.next();
		      System.out.println(entry.getKey()+"="entry.getValue()); 
		  }
		 
		System.out.println("**************************");

		// 3.Keys Set and Values Collection
		Set<String> set = mapData.keySet();
		System.out.println(set);
		Collection<String> values = mapData.values();
		System.out.println(values);

	}

}
