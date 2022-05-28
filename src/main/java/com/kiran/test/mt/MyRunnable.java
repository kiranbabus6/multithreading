package com.kiran.test.mt;

public class MyRunnable implements Runnable {

	public void run()
	{
		System.out.println("My runnable running "+Thread.currentThread().getName() );
		doSomeDelay();
		System.out.println("My runnable finished "+Thread.currentThread().getName());
	}
	
	public MyRunnable()
	{}
	
	public synchronized void doSomeDelay()
	{
		System.out.println("sleeping "+Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
			System.out.println("woke up "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		Thread mt = new Thread( new MyRunnable() );
		mt.start();
		Thread mt1 = new Thread( new MyRunnable() );
		mt1.start();
	}
}
