package com.wolken.wolkenapp.exceptions;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

@Component
public class IplException extends Exception {
	Logger logger=Logger.getLogger("IplException");
	@Override
	public String getMessage() {
		logger.info("inside custom exception");
		return "into user defined exception";
	}

}
