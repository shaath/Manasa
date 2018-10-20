package com.SeleniumProject.javaprogrammes;

public class InheritanceEg extends MethodsEg
{

	public static void main(String[] args) 
	{
		
		Function1();
		
//		MethodsEg m=new MethodsEg();
		
		int res=sum(50, 20);
		System.out.println(res);
	}

	public static int sum(int a,int b)
	{
		System.out.println("This is child class provided method");
		return 0;
	}
}
