package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary {
    public void getBook() {
    System.out.println("Take book in School library");
    }
}
