package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Maxim Vlasov", 2, 4.6);
        Student st2 = new Student("Maxim Ivanov", 4, 3.9);
        Student st3 = new Student("Maxim Petrov", 1, 4.9);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
    System.out.println("information from method getStudents: ");
    System.out.println(students.get(4));
    System.out.println(students);
    return students;
    }
}
