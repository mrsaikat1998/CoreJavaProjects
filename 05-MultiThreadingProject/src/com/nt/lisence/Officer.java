package com.nt.lisence;

public class Officer extends Thread {
	TestDrive testDrive;
	
	public Officer(TestDrive testDrive) {
		this.testDrive = testDrive;
	}

	public void run() {	
		try {
			testDrive.join();
			System.out.println("Officer Start");
			Thread.sleep(3000);
			System.out.println("Officer Signature Completed");
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
