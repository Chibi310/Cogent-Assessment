package com.thread;

public class JavaLang extends Thread implements Language
{
	public void showMessage()
	{
		System.out.println("Java Program is running");
	}

	@Override
	public void run()
	{
		showMessage();
	}
}
