package com.anthony.sample.parallel.execution;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.anthony.sample.parallel.execution.tasks.Task1;
import com.anthony.sample.parallel.execution.tasks.Task2;
import com.anthony.sample.parallel.execution.tasks.Task3;

public class App {
	
	public static void main(String[] args){
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		Task1 task1 = new Task1();
		Task2 task2 = new Task2();
		Task3 task3 = new Task3();
		executorService.execute(task1);
		executorService.execute(task2);
		executorService.execute(task3);
		executorService.shutdown();
	}

}
