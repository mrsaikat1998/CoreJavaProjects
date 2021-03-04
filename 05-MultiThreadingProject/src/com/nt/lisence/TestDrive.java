package com.nt.lisence;

public class TestDrive extends Thread {
	Medical medical;

	public TestDrive(Medical medical) {
		this.medical = medical;
	}

	public void run() {
		try {
			medical.join();
			System.out.println("Test-Drive Start");
			Thread.sleep(3000);
			System.out.println("Test-Drive Completed");
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
