package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;

public class ArraylistEg {

	public static void main(String[] args)
	{
		ArrayList<Object>  x=new ArrayList<Object>();
		
		//Writing the data into arraylist
		
		x.add("Manasa");
		x.add("Selenium");
		x.add(60000);
		x.add(true);
		
		x.add(2, "Sharath");
		//Getting the length of an arraylist
		
		System.out.println(x.size());

		//Reading the data from an arraylist
		
		for (int i = 0; i < x.size(); i++) 
		{
			System.out.println(x.get(i));			
		}
	}

}
