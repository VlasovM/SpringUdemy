package com.javlasov.Spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {

    @Around("execution(* com.javlasov.Spring.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature =
                (MethodSignature) proceedingJoinPoint.getSignature();
        String name = methodSignature.getName();

        System.out.println("Begin of " + name);
        Object targetMethodResult = proceedingJoinPoint.proceed();
        System.out.println("End of " + targetMethodResult );
        return targetMethodResult;
    }
}
