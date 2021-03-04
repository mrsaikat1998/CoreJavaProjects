package com.nt.list;

public class Faculty {
	private String fname;
	private String fadd;
	private String sub;

	public Faculty() {

	}

	public Faculty(String fname, String fadd, String sub) {
		this.fname = fname;
		this.fadd = fadd;
		this.sub = sub;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFadd() {
		return fadd;
	}

	public void setFadd(String fadd) {
		this.fadd = fadd;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "Faculty :: Faculty Name=" + fname + ", Address=" + fadd + ", Subject=" + sub;
	}

}
