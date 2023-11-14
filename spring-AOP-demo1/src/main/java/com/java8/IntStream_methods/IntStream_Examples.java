package com.java8.IntStream_methods;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStream_Examples {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
       // IntStream stream = IntStream.rangeClosed(0,100);
       IntStream stream = IntStream.of(array);
       // stream.forEach(System.out::println);

     /*   IntStream.generate(() -> ThreadLocalRandom.current().nextInt())
                 .limit(5)
                 .forEach(System.out::println);*/

        // Taking out max value form integers
        OptionalInt result = stream.max();
        System.out.println(result);
    }
}
