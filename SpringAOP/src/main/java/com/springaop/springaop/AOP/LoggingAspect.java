package com.springaop.springaop.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

    public static final Logger LOGGER= LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.springaop.springaop.Service.*.*(..))")
    public void logMethodCall() {
        LOGGER.info("Method called ");
    }

//    @Before("execution(* com.springaop.springaop.Service.JobService.getAllJobs(..))")
//    public void logMethodcalling(JoinPoint jp) {
//        LOGGER.info("Success: " + jp.getSignature().getName());
//    }

    @After("execution(* com.springaop.springaop.Service.JobService.getAllJobs(..))")
    public void logmethodafter(JoinPoint jp)
    {
        LOGGER.info("success :"+ jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.springaop.springaop.Service.JobService.addJob(..))")
    public void logexception(JoinPoint jp)
    {
        LOGGER.info("exception:"+jp.getSignature().getName());
    }




}
