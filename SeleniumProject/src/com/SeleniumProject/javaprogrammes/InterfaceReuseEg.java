package com.SeleniumProject.javaprogrammes;

public class InterfaceReuseEg
{

	public static void main(String[] args)
	{
		InterfaceEg im=new InterfaceImplementsEg();
			
		im.car();
		
		
		InterfaceEg it=new InterfaceImplementsEg2();
		it.car();
	}

}
