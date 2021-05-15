package com.java.threads;

class OddNumbers implements Runnable {

	static boolean flag = true;
	Object lock = null;

	public OddNumbers(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 50; i = i + 2) {

			synchronized (lock) {

				while (!flag) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				System.out.println("Thread 1 " + i);
				flag = false;
				lock.notifyAll();
			}
		}

	}
}

class EvenNumbers implements Runnable {
	Object lock = null;

	public EvenNumbers(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		for (int i = 2; i <= 50; i = i + 2) {
			synchronized (lock) {
				while (OddNumbers.flag) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				System.out.println("Thread 2 " + i);
				OddNumbers.flag = true;
				lock.notifyAll();

			}
		}

	}
}

public class NaturalOrderingUsingWaitNotify {
	private static Object lock = new Object();

	public static void main(String[] args) {
		new Thread(new OddNumbers(lock)).start();
		new Thread(new EvenNumbers(lock)).start();

	}

}
