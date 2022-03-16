package aop;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Book {
    @Value("1984")
    private String name;

    @Value("George Orwell")
    private String author;

    @Value("1949")
    private int yearOfPublication;
}
