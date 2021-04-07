package com.wolken.wolkenapp.exception;

public class MobileIdException extends Exception {
	@Override 
	public String getMessage() {
		System.out.println("inside  custom exception");
		return "id given is already present or id can't be negative";
	}

}
