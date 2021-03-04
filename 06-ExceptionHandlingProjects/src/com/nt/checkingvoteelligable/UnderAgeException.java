package com.nt.checkingvoteelligable;

public class UnderAgeException extends Exception {
	public UnderAgeException() {
		super("You are Under Age");
	}
	UnderAgeException(String message){
		super(message);
	}
}
