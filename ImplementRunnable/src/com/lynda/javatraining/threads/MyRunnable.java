package com.lynda.javatraining.threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {

		int iterations = 5;

		try {
			for (int i = 0; i < iterations; i++) {
				System.out.println("From Runnable");
				Thread.sleep(300);
			}
		} catch (InterruptedException e) {
			System.err.println(e);
		}
	}

}
