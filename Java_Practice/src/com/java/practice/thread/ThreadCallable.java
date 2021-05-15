package com.java.practice.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class CollableTask implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			sum += i;

		}

		return sum;
	}
}

public class ThreadCallable {
	public static void main(String[] args) {

		FutureTask<Integer> futureTask[] = new FutureTask[5];
		for (int i = 0; i < futureTask.length; i++) {
			Callable<Integer> callable = new CollableTask();
			futureTask[i] = new FutureTask<>(callable);
			Thread thread = new Thread(futureTask[i]);
			thread.start();

		}
		for (int i = 0; i < 5; i++) {
			FutureTask<Integer> result = futureTask[i];
			try {
				System.out.println("==="+result.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}

	}

}
