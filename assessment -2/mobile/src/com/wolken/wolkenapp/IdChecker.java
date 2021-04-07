package com.wolken.wolkenapp;

import com.wolken.wolkenapp.exception.MobileIdException;

public class IdChecker {
	public void check(int  id )throws MobileIdException {
		System.out.println("inside check method to check the id");
		if(id!=0 && id >0) {
			System.out.println("ID is proper");
		}
		else {
			System.out.println("enter into the custom exception");
			throw new MobileIdException();
		}
	}

}
