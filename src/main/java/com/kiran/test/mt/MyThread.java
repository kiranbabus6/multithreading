package com.kiran.test.mt;

public class MyThread extends Thread {

	public void run()
	{
		System.out.println("My Thread running");
		System.out.println("My Thread finished");
	}
	
	public static void main(String[] args)
	{
		MyThread mt = new MyThread();
		mt.start();
	}
}
