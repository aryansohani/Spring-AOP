package com.springaop.springaop.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MonitoringAspect {

    public static final Logger LOGGER= LoggerFactory.getLogger(MonitoringAspect.class);

    @Around("execution(* com.springaop.springaop.Service.*.*(..))")
    public Object monitortime(ProceedingJoinPoint pjp) throws Throwable {

        long start=System.currentTimeMillis();

        Object obj=pjp.proceed();

        long end= System.currentTimeMillis();

        LOGGER.info("Time taken :"+ (end-start)+" "+ pjp.getSignature().getName());

        return obj;
    }



}
