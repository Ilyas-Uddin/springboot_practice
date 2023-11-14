package com.java8.parallel_streams;

import java.util.Arrays;
import java.util.List;

class Student
{
    String name;
    int score;

    Student(String name, int score)  // Parameterized Constructor
    {
        this.name = name;
        this.score = score;
    }

    // Getter methods
    public String getName()
    {
        return this.name;
    }
    public int getScore()
    {
        return this.score;
    }

}
public class ParallelStreams_Example {
    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student("Zeeshan", 12),
                new Student("Ilyas", 23),
                new Student("Soha", 56),
                new Student("Hamza", 11),
                new Student("Farhan", 44)
        );

        // Using Stream() --> sequential operation we can perform
        studentList.stream().parallel()
                .filter(e -> e. getScore() >= 20)
                .limit(2)
                .forEach(stu -> System.out.println(stu.getName() + " -> " + stu.getScore()));

        // Using ParallelStream() --> Non-Sequential operation we can perform which are not ordered preferred
        studentList.parallelStream()
                .filter(s -> s.getScore() >= 20)
                .limit(2)
                .forEach(e -> System.out.println(e.getName() + "-> " + e.getScore()));


        // Converting Stream() --->>> ParallelStream()
        studentList.stream().parallel()
                .filter(e -> e. getScore() >= 20)
                .limit(2)
                .forEach(stu -> System.out.println(stu.getName() + " -> " + stu.getScore()));
    }
}
