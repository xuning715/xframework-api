package com.x.framework.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BusinessException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private static Logger logger = LoggerFactory.getLogger(BusinessException.class);

    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
        logger.error(message);
    }

    public BusinessException(Throwable e) {
        super(e);
        logger.error(null, e);
    }

    public BusinessException(String message, Throwable e) {
        super(message);
        logger.error(message, e);
    }
}
