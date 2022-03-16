package aop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class Student {

    private String nameSurname;

    private int course;

    private double avgGrade;


}
