package com.kiran.test.mt;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyLock implements Runnable {

	public void run()
	{
		System.out.println("My runnable running "+Thread.currentThread().getName() );
		doSomeDelay();
		System.out.println("My runnable finished "+Thread.currentThread().getName());
	}
	
	public MyLock()
	{}
	
	public void doSomeDelay()
	{
		Lock lock = new ReentrantLock();
		lock.lock();
		try {
			System.out.println("sleeping "+Thread.currentThread().getName());
			Thread.sleep(10000);
			System.out.println("woke up "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally
		{
			lock.unlock();
		}
		
	}
	
	public static void main(String[] args)
	{
		Thread mt = new Thread( new MyLock() );
		mt.start();
		Thread mt1 = new Thread( new MyLock() );
		mt1.start();
	}
}
