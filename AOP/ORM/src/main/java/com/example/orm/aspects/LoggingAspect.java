package com.example.orm.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
@Order(2)
public class LoggingAspect {

    @Before("execution(public * findEmployeeById(..))")
    public void loggingAspectBefore(JoinPoint joinPoint) {
        System.out.println("In Aspect 2 >> Before Calling: " + joinPoint.getSignature());
    }

    @After("findEmployeePointCut()")
    public void loggingAspectAfter(JoinPoint joinPoint) {
        System.out.println(" After Calling: " + joinPoint.getSignature());
    }

    @AfterReturning(value = "findEmployeePointCut() || getAllPointCut()", returning = "")
    public void loggingAspectAfterReturning(JoinPoint joinPoint) {
        System.out.println(" After Return Calling: " + joinPoint.getSignature());
    }

    @AfterThrowing(value = "findEmployeePointCut()", throwing = "ex")
    public void loggingAspectAfterThrowing(JoinPoint joinPoint, Throwable ex) {
        System.out.println("Catching Exception on: " + joinPoint.getSignature());
    }

    @Around("findEmployeePointCut()")
    public void loggExecutionTime(ProceedingJoinPoint joinPoint){
        long startTime = System.currentTimeMillis();
        System.out.println("Before calling" + joinPoint.getSignature());

        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Function:" + joinPoint.getSignature() + "executed within :" + (endTime - startTime));
        System.out.println("After calling" + joinPoint.getSignature());
    }

    @Pointcut("execution(public * findEmployeeById(..))")
    public void findEmployeePointCut() {}

    @Pointcut("execution(public * getAll*(..))")
    public void getAllPointCut() {}
}
