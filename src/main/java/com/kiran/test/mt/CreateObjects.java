package com.kiran.test.mt;

import java.util.ArrayList;
import java.util.List;

public class CreateObjects {

	public static List<MyCallable<StudentVo>> returnObjs()
	{
		
		StudentVo st = new StudentVo("1","Akki","3rd grade","A+");
		StudentVo st1 = new StudentVo("2","Chittu","4th grade","A+");
		StudentVo st2 = new StudentVo("3","Jaanu","5th grade","A+");
		StudentVo st3 = new StudentVo("4","nenu","6th grade","A+");
		StudentVo st4 = new StudentVo("5","amma","7th grade","A+");
		StudentVo st5 = new StudentVo("6","thambi","8th grade","A+");
		List<StudentVo> stList = new ArrayList<StudentVo>();
		List<MyCallable<StudentVo>> taskList = new ArrayList<MyCallable<StudentVo>>();
		stList.add(st);
		stList.add(st1);
		stList.add(st2);
		stList.add(st3);
		stList.add(st4);
		stList.add(st5);
		for(StudentVo loopst : stList)
		{
			MyCallable<StudentVo> task = new MyCallable<StudentVo>(loopst,(int)(Math.random()*900)+100);
			taskList.add(task);
		}

		return taskList;
	}
}
