package com.kiran.test.mt;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyExecutorService {

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		ExecutorService execService = Executors.newFixedThreadPool(3);
		List<MyCallable<StudentVo>> taskList = CreateObjects.returnObjs() ;		
		List<Future<StudentVo>> resultList = execService.invokeAll( taskList );
		for(Future<StudentVo> fsvo : resultList)
		{
			StudentVo fsvost = fsvo.get();
			System.out.println(fsvost.studentRank);
		}
	}

	
}
