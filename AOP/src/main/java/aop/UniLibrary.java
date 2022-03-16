package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {
  public void getBook() {
    System.out.println("Берем книгу из UniLibrary");
    System.out.println("--------------------------");
  }

  public void getMagazine() {
    System.out.println("Берем журнал из UniLibrary");
    System.out.println("--------------------------");
  }

  public String returnBook() {
    System.out.println("Возвращаем журнал в UniLibrary");
    return "1984";
  }

  public void addBook(String personName, Book book) {
    System.out.println("Добавляем книгу в UniLibrary");
    System.out.println("--------------------------");
  }

  public void addMagazine() {
    System.out.println("Добавляем журнал в UniLibrary");
    System.out.println("--------------------------");
  }
}
