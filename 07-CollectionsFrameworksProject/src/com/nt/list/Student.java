package com.nt.list;

public class Student {
	private String sname;
	private String sadd;
	private double avg;

	public Student() {

	}

	public Student(String sname, String sadd, double d) {
		this.sname = sname;
		this.sadd = sadd;
		this.avg = d;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSadd() {
		return sadd;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sadd=" + sadd + ", avg=" + avg + "]";
	}

}
