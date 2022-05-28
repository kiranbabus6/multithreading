package com.kiran.test.mt;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCompletionService {

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		Executor executor = Executors.newFixedThreadPool(3);
		CompletionService<StudentVo> completionService = new ExecutorCompletionService<StudentVo>( executor );
		List<MyCallable<StudentVo>> taskList = CreateObjects.returnObjs() ;
		for(MyCallable<StudentVo> mcso : taskList)
		completionService.submit(mcso);
		Future<StudentVo> fsvo = completionService.poll();
		if(fsvo!=null)
		System.out.println("Final completion "+fsvo.get().toString());
		
	}


	
}
