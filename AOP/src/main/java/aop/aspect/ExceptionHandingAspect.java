package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandingAspect {

    @Before("aop.aspect.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandingAdvice() {
    System.out.println("beforeGetExceptionHandingAdvice: ловим исключение при попытке взять книгу/журнал");
        System.out.println("--------------------------");
    }
}
