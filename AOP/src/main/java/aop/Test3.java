package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {

  public static void main(String[] args) {
      AnnotationConfigApplicationContext context =
              new AnnotationConfigApplicationContext(MyConfig.class);

      UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
      String name = uniLibrary.returnBook();
    System.out.println("В библиотеку вернули " + name);

    context.close();
  }
}
