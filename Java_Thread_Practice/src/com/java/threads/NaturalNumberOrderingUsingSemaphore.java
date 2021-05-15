package com.java.threads;

import java.util.concurrent.Semaphore;

class OddNumber implements Runnable {

	Semaphore one;
	Semaphore two;

	public OddNumber(Semaphore one, Semaphore two) {
		super();
		this.one = one;
		this.two = two;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 50; i = i + 2) {
			try {
				one.acquire();
				System.out.println(Thread.currentThread().getName() + "		->" + i);
				two.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}

class EvenNumber implements Runnable {

	Semaphore one;
	Semaphore two;

	public EvenNumber(Semaphore two, Semaphore one) {
		super();
		this.one = one;
		this.two = two;
	}

	@Override
	public void run() {

		for (int i = 2; i <= 50; i = i + 2) {
			try {
				two.acquire();
				System.out.println(Thread.currentThread().getName() + "		->" + i);
				one.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

public class NaturalNumberOrderingUsingSemaphore {
	public static void main(String[] args) {
		Semaphore one = new Semaphore(1);
		Semaphore two = new Semaphore(0);

		OddNumber oddNumber = new OddNumber(one, two);
		EvenNumber evenNumber = new EvenNumber(two, one);

		new Thread(oddNumber,"Odd Number").start();
		new Thread(evenNumber,"Even Number").start();

	}
}
