package com.SeleniumProject.javaprogrammes;

public class ObjectEg {

	public static void main(String[] args) 
	{
		Object[] x={20000,"Seleenium",'M',true,333.33};
		
		System.out.println(x.length);
		
		for(Object data: x)
		{
			System.out.println(data);
		}

	}

}
