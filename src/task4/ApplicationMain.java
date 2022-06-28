package task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApplicationMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Dima", "Ivanov", "ABC-18", 4),
                new Student("Sasha", "Smirnov", "BCD-22", 1),
                new Student("Vanya", "Ivanov", "DEF-21", 2),
                new Student("Vanya", "Popov", "ABC-20", 3),
                new Student("Katya", "Petrova", "ABC-20", 3),
                new Student("Ann", "Sokolova", "DEF-22", 1),
                new Student("Roman", "Ivanov", "ABC-21", 2)
        ));

        Collections.sort(students); //MergeSort или TimSort
        for(Student s : students){
            System.out.println(s);
        }
    }
}
