package com.example.orm.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class SecondAspect {

    @Before("execution(public * findEmployeeById(..))")
    public void loggingAspectBefore(JoinPoint joinPoint) {
        System.out.println("In Aspect 1 >> Before Calling: " + joinPoint.getSignature());
    }
}
