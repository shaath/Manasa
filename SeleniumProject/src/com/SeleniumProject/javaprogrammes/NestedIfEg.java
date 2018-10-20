package com.SeleniumProject.javaprogrammes;

public class NestedIfEg {

	public static void main(String[] args)
	{
		int a=20;
		int b=10;
		int c=500;
		
		if(a > b && a > c)
		{
			System.out.println("A is greater");
		}
		else if (b > a && b > c) 
		{
			System.out.println("B is greater");
		}
		else if (c > a && c > b) 
		{
			System.out.println("C is greater");
		}

	}

}
