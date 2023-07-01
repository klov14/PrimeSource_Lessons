package Bizhan_ex;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        Teacher teacher1 = new Teacher("teacher", "teacher123", "Maths", "1B");
//        teacher1.createTest();
        Student student1 = new Student("student1", "student123", 3.4, "lox");
        System.out.println(student1.countLines("Test.txt"));
    }
}
