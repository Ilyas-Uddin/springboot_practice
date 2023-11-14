package com.java8.Coding_problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountNumberOfOccurenceOfStringWords {
    public static void main(String[] args) {

       /* String str = "Welcome to Code Decode and Code Decode Welcome you";
        List<String> list = Arrays.asList(str.split(" ")); //Splitting the given string with space

        Map<String, Long> map = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                System.out.println(map);

                Function<String, String> fn = Function.identity();
                System.out.println(fn.apply("Zeeshan"));*/

        // Reverse all the strings present in the list.
        List<String> myList = Arrays.asList("riyaz", "ilyas");
        List<String > list2 = myList.stream().map(str -> new StringBuilder(str).reverse().toString())
                    .collect(Collectors.toList());
        list2.forEach(System.out::println);
        System.out.println(list2);

        //
        List<String> list3 = myList.stream().map(str -> new StringBuilder(str).append("Mr. ").toString()).collect(Collectors.toList());
        System.out.println(list3);

        List<String> list4 = myList.stream().map(str -> {
           // String finalStr = str.concat("Mr.");
            String finalStr = "Mr.".concat(str);
           // String finalStr = "Mr.".concat(str).concat(null);
           // String finalStr = "Mr." + str + null;
            return finalStr;
        }).collect(Collectors.toList());
        System.out.println("->> " + list4);


    }






}
