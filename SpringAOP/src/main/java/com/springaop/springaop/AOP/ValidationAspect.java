package com.springaop.springaop.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {


    private static final Logger LOGGER= LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* com.springaop.springaop.Service.JobService.getjob(..)) && args(postid)")
    public Object Validation(ProceedingJoinPoint pjp,int postid)throws Throwable
    {
        if(postid < 0)
        {
            LOGGER.info("validate the post id and updating");
            postid = -postid;
            LOGGER.info("updated post id"+ postid);

        }

        Object obj= pjp.proceed(new Object[]{postid});

        return obj;



    }




}
