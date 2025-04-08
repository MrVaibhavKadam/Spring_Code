package com.exceptions;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExceptionHandlee {

    @AfterThrowing(pointcut = "execution(* com.dao.*.*(..))", throwing = "ex")
    public void logException(Exception ex) {
        System.err.println("Exception occurred: " + ex.getMessage());
    }

}
