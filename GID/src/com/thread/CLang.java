package com.thread;

public class CLang extends Thread implements Language
{
	public void showMessage()
	{
		System.out.println("C Program is running");
	}
	
	@Override
	public void run()
	{
		showMessage();
	}
}
