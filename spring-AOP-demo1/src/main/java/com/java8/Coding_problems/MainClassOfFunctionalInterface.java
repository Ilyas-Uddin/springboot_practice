package com.java8.Coding_problems;

public class MainClassOfFunctionalInterface {
    public static void main(String[] args) {

        MultiplyTwoNumbersUsingFunctionalInterface total = (num1, num2) -> num1*num2;
        System.out.println(total.multiply(5,8));
    }
}
