package com.java8.Coding_problems;

import java.util.Arrays;
import java.util.List;

public class LimitAndSkipMethodsDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90);
      //  list.stream().limit(5).forEach(System.out::println);

        //TODO: Using skip(6), {it will skip elements till 60, it will print 70, 80, 90}
        list.stream().skip(6).forEach(System.out::println);
    }
}
