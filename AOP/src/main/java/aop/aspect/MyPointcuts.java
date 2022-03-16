package aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* aop.UniLibrary.add*(..))")
    public void allAddMethods() {}
}
