package com.thread;

import  java.util.Scanner;


public class TestClient
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner kbd = new Scanner(System.in);
		
		CLang c = new CLang();
		JavaLang j = new JavaLang();
		
		System.out.print("Select Favorite Lanaguage [C/Java]: ");
		
		String fave = kbd.nextLine();
		
		if(fave.equals("C"))
		{
			c.setPriority(10);
			j.setPriority(1);
		}
		else if (fave.equals("Java"))
		{
			j.setPriority(10);
			c.setPriority(1);
		}
		
		c.start();
		j.start();
		
		
		System.out.println("C Priority: " + c.getPriority() + "\nJava Priority: " + j.getPriority());
	}
}