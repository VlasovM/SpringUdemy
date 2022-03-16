package aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    System.out.println("aroundReturnBookLoggingAdvice: в библиотеку вернули книгу");

    Object targetMethodResult = proceedingJoinPoint.proceed();
    return targetMethodResult;
    }
}
