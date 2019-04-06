package com.Package1;

public class Test1 {
	
	public void m1()
	{
		System.out.println("This is m1 in the Test1");
	}
	
	public void m2() throws Exception
	{
		// comments
		System.out.println("This is m2 in the Test1");
	}
	
	public void m4()
	{
		// this is method 4 added in between m2 and m3
	}
	
	public void m3()
	{
		// written by test2
		System.out.println("This is m3 in the Test1 class file");
		System.out.println("Done in the Test2 branch"); // updated by the Test2 user
	}

}
