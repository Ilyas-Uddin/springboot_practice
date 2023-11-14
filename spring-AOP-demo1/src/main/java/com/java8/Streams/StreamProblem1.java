package com.java8.Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamProblem1 {
    public static void main(String[] args) {

        // Printing out only even numbers using Jav -8 streams.
        List<Integer> arList = new ArrayList<Integer>();
        arList.add(17);
        arList.add(21);
        arList.add(40);
        // Using streams and performing Map operation.
      /*  Stream stm = arList.stream().map(i -> i * i);
        // Squaring each numbers.
        stm.forEach(x -> System.out.println("Square is: "+x));*/

        // Reducing to just 1 line
        // Min() and max() operation, using comparator().
        Integer finalList1 = arList.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("Min number is: " + finalList1);

        Integer finalList2 = arList.stream().max((i1, i2) -> i2.compareTo(i1)).get();
        System.out.println("Max number is: " + finalList2);

        System.out.println("==================================");

        System.out.println(arList.stream().filter(i -> i%2 == 0).map(a -> a+a).count());

        System.out.println("Reduce method example");

        System.out.println(arList.stream().reduce((a, b) -> a+b).get());


    }
}