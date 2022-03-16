package aop.aspect;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

  @Before("aop.aspect.MyPointcuts.allAddMethods()")
  public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
    MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

    if (methodSignature.getName().equals("addBook")) {
      Object[] arguments = joinPoint.getArgs();
      for (Object obj : arguments) {
        if (obj instanceof Book) {
          Book book = (Book) obj;
          System.out.println(book.getName() + " - " + book.getAuthor() + " - " + book.getYearOfPublication());
        }


      }
    }

    System.out.println("beforeGetBookAdvice: логирование попытки взять книгу/журнал");
    System.out.println("--------------------------");
  }



//  @Pointcut("execution(* aop.UniLibrary.*(..))")
//  private void allMethodsFromUniLibrary() {}
//
//  @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//  private void returnMagazineFromUniLibrary() {}
//
//  @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//  private void allMethodsExceptReturnMagazineFromUniLibrary() {}
//
//  @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//  public void beforeAllMethodsExceptReturnMagazineFromUniLibrary() {
//  System.out.println("beforeAllMethodsExceptReturnMagazineFromUniLibrary: log #4");

//  }

//  @Pointcut("execution( * aop.UniLibrary.get*())")
//  private void allGetMethodsFromUniLibrary() {}
//
//  @Pointcut("execution( * aop.UniLibrary.return*())")
//  private void allReturnMethodsFromUniLibrary() {}
//
//  @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//  private void allGetAndReturnMethodsFromUniLibrary() {}
//
//  @Before("allGetMethodsFromUniLibrary()")
//  public void beforeGetLoggingAdvice() {
//    System.out.println("beforeGetLoggingAdvice: log #1");
//  }
//
//  @Before("allReturnMethodsFromUniLibrary()")
//  public void beforeReturnLoggingAdvice() {
//    System.out.println("beforeReturnLoggingAdvice: log #2");
//  }
//
//  @Before("allGetAndReturnMethodsFromUniLibrary()")
//  public void beforeGetAndReturnLoggingAdvice() {
//    System.out.println("beforeGetAndReturnLoggingAdvice: log #3");

//  }



}
