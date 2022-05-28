package com.kiran.test.mt;

import java.util.concurrent.Callable;

public class MyCallable<T> implements Callable<T> {

	private T t;
	private int delayTime;
	public T call() throws InterruptedException
	{
		TaskExecutor<T> te = new TaskExecutor<T>();
		System.out.println("starting delay for "+ t.toString()+" with delay time "+delayTime);
		T t1 = te.getDelayTask(t, delayTime);
		System.out.println("completed delay for "+ t.toString()+" with delay time "+delayTime);
		return t1;
	}
	
	public MyCallable(T st, int i)
	{
		this.t=st;
		this.delayTime=i;
	}
	
}
