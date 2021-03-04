package com.nt.lamda;

public class LamdaTest1 {
	int x=10;
	public void m2() {
		int y=20;
		Intrf i=()->{
			System.out.println("X :: "+x);
			System.out.println("Y :: "+y);
		};
		i.m1();
	}
	
	public static void main(String[] args) {
		LamdaTest1 t1=new LamdaTest1();
		t1.m2();
	}

}
