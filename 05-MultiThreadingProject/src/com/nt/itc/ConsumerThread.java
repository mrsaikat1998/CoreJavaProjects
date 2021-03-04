package com.nt.itc;

public class ConsumerThread implements Runnable {

	private Factory factory;

	public ConsumerThread(Factory factory) {
		this.factory = factory;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			factory.consume(i);
		}

	}

}
