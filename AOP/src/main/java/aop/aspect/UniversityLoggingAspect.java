package aop.aspect;

import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @AfterThrowing(pointcut = "execution( * getStudents())", throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
    System.out.println("afterThrowingGetStudentsLoggingAdvice: exception! " + exception);
    }




//    @Before("execution( * getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//    System.out.println("beforeGetStudentsLoggingAdvice: logging list of students");
//    }
//
//    @AfterReturning(pointcut = "execution( * getStudents())", returning = "students")
//    public void afterGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent =  students.get(0);
//        String name = firstStudent.getNameSurname();
//        name = "Mister" + name;
//        firstStudent.setNameSurname(name);
//        System.out.println("afterGetStudentsLoggingAdvice: logging list of students");
//    }
}
