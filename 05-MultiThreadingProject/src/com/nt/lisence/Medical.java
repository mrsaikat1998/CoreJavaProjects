package com.nt.lisence;

public class Medical extends Thread {
	public void run() {
		System.out.println("Medical Start");
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Medical Completed");
	}
}
