package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetEg {

	public static void main(String[] args)
	{
		Set<Object> s=new HashSet<Object>();
		
		s.add("Manasa");
		s.add("Selenium");
		s.add(20000);
		s.add("Apple");
		s.add("Apple");
		
		
		Iterator<Object> it=s.iterator();
		
		while(it.hasNext())
		{
			Object data=it.next();
			System.out.println(data);
		}

	}

}
