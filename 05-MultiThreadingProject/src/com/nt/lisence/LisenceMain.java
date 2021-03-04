package com.nt.lisence;

public class LisenceMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		Medical medical = new Medical();
		TestDrive testDrive = new TestDrive(medical);
		Officer officer = new Officer(testDrive);
		medical.start();
		testDrive.start();
		officer.start();
		try {
			officer.join();
			System.out.println("Main End");
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
