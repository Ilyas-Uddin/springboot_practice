package com.java8.Coding_problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElementsFromListUsingStreams {
    public static void main(String[] args) {

        // Find the duplicate elements from the integer list using stream function?

        List<Integer> list = Arrays.asList(10, 28, 87, 10, 20, 76, 28, 80, 80, 80);
        // Saving these elements in set, which does not allow duplicates in it.
        Set<Integer> set = new HashSet<>();

       /* Using stream and adding set in it.
        We want which are duplicate among these integers.
        By checking if these elements arte not set, we will get Duplicates 10, 28, 80, 80
        80 it is counting twice, for that, we need to collect it in set.*/
        list.stream().filter(f -> !set.add(f))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
