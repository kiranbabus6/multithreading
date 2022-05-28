package com.kiran.test.mt;

public class TaskExecutor<T> {
	
	public T getDelayTask(T t, int i) throws InterruptedException
	{
		Thread.sleep(i);
		return t;
	}

}
