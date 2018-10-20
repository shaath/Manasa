package com.SeleniumProject.javaprogrammes;

public class ReuseEg {

	public static void main(String[] args)
	{
		MethodsEg m=new MethodsEg();
		
		m.Function1();

		int res=m.sum(600,400);
		System.out.println(res);
		
		res=m.sum(20, 30, 50);
		System.out.println(res);
	}

}
