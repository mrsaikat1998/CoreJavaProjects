package com.nt.itc;

public class ProducerThread implements Runnable {
	Factory factory;
	
	public ProducerThread(Factory factory) {
		this.factory = factory;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			factory.produce(i);
		}
	}
}
