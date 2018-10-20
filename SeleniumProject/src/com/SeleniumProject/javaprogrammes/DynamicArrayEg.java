package com.SeleniumProject.javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args)
	{
		int[] s=new int[5];
		
		System.out.println(s.length);
		
		//Writing the data into an array
		
		s[2]=10000;
		s[4]=60000;

		s[2]=30000;
		
		for (int i = 0; i < s.length; i++)
		{
			System.out.println(s[i]);
		}
	}

}
