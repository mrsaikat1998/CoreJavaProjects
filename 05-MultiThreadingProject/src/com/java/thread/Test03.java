package com.java.thread;

class MyThread2 implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println("Thread1 "+i);
		}
	}
}

class MyThread3 implements Runnable{
	@Override
	public void run() {
		for(int i=30;i<=50;i++) {
			System.out.println("Thread2 "+i);
		}	
	}
}

public class Test03{
	public static void main(String[] args) {
		Thread th1=new Thread(new MyThread2());
		th1.start();
		Thread th2=new Thread(new MyThread3());
		th2.start();
		for(int i=60;i<=90;i++) {
			System.out.println("main "+i);
		}
	}
}