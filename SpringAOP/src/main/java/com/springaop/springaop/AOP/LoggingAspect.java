package com.springaop.springaop.AOP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingAspect {

    public static final Logger LOGGER= LoggerFactory.getLogger(LoggingAspect.class);

    public void LogMethodCall()
    {
        LOGGER.info("method called");
    }


}
