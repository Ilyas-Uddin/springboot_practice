package com.java8;

public class Main {
    public static void main(String[] args) {
       // Using Lambda
        Employee employee = () -> "Software Engineer!!";
        System.out.println(employee.getName());

        Employee tester = () -> "Tester!!";
        System.out.println(tester.getName());
    }
}
