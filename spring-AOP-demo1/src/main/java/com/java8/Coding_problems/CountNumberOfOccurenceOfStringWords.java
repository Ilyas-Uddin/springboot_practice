package com.java8.Coding_problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNumberOfOccurenceOfStringWords {
    public static void main(String[] args) {
/*
        String str = "Welcome to Code Decode and Code Decode Welcome you";
        List<String> list = Arrays.asList(str.split(" ")); //Splitting the given string with space

        Map<String, Long> map = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        // Function identity example
        Function<String, String> fn = Function.identity();
        System.out.println(fn.apply("Zeeshan"));*/

        // Reverse all the strings present in the list.
      /*  List<String> myList = Arrays.asList("riyaz", "ilyas");
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
        System.out.println("->> " + list4);*/

        System.out.println("***********************************");

        //TODO: COUNTING NUM OF OCCURRENCE OF WORDS

       /* List<String> list1 = Arrays.asList("Honda", "Pulsar", "TVS", "Honda", "Pulsar", "TVS", "Activa", "Pulsar");
        System.out.println(list1.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        System.out.println("*************************** practice");*/
/*
        String inputString = "welcome to code decode and code decode welcome you";
        // We are converting it into the Map(String, Integer)
        List<String> list2 = Arrays.asList(inputString.split(" "));
        Map<String, Long> map2 = list2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map2);*/

        System.out.println("Example: 3");
        String str3 = "my name is ilyas and ilyas is my name";
        List<String> list3 = Arrays.asList(str3.split(" "));

        Map<String, Long> map3 = list3.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map3);


    }
}
