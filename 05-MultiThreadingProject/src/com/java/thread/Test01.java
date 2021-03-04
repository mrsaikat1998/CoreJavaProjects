package com.java.thread;

class MyThread1 extends Thread{
	public void run() {
		Test01.m2();
	}
}

public class Test01 {

	public static void main(String[] args) {
		System.out.println("main() start");
		MyThread1 myThread=new MyThread1();
		myThread.start();
		m1();
		m2();
		System.out.println("main() end");

	}
	
	static public void m1() {
		System.out.println("m1() start");
		int n=10;
		while(n==10) {
			
		}
		System.out.println("m1() end");
	}
	
	static public void m2() {
		System.out.println("m2() start");
		
		System.out.println("m2() end");
	}

}
