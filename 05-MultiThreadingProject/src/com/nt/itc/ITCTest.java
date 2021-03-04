package com.nt.itc;

public class ITCTest {

	public static void main(String[] args) {
		System.out.println("Main Started");
		Factory factory=new Factory();
		
		ProducerThread producer=new ProducerThread(factory);
		ConsumerThread consumer=new ConsumerThread(factory);
		
		new Thread(producer).start();
		new Thread(consumer).start();

		System.out.println("Main Started");
	}

}
