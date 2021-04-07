package com.wolken.wolkenapp;

import org.jboss.logging.Logger;

public class LibraryException extends Exception {
	Logger logger=Logger.getLogger("LibraryException");
	@Override
	
	public String getMessage() {
		logger.info("overriden get message");
		return "into user defined exception";
	}

}
