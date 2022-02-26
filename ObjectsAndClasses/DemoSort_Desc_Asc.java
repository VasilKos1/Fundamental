package DEMO.ObjectsAndClasses_Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DemoSort_Desc_Asc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Student
        // name -> String
        // averageScore -> double

        Student st1 = new Student("Kaloyan", 5.00);
        Student st2 = new Student("Peter", 5.50);
        Student st3 = new Student("Anton", 5.00);
        Student st4 = new Student("Sofia", 6.00);

        List<Student> students = new ArrayList<>(Arrays.asList(st1, st2, st3, st4));

        students.stream()
                .sorted((s1, s2) -> {
                    int sort = Double.compare(s2.getAverageScore(), s1.getAverageScore()); // print descending by score
                    if (sort == 0) {
                        return s1.getName().compareTo(s2.getName());  // print ascending by name
                    }
                    return sort;
                })
                .forEach(s -> System.out.println(s.toString()));
    }

    static class Student{
        String name;
        double averageScore;

        Student() {

        }

        public Student(String name, double averageScore) {
            this.name = name;
            this.averageScore = averageScore;
        }

        public String getName() {
            return name;
        }

        public double getAverageScore() {
            return averageScore;
        }

        @Override
        public String toString() {
            return String.format("I am %s with avg. score: %.2f", this.name, this.averageScore);
        }
    }
}
