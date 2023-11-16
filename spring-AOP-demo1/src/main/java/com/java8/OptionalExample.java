package com.java8;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

       // String str = null;
     /*   String str = "This Is November";
        // Providing the if condition to check null
        if(str == null)
        {
            System.out.println("Given String is null");
        } else
        {
            System.out.println("Length of given String is: " + str.length());
        }*/

        String str = "Java is my favourite";

        System.out.println("************* isEmpty() method example**************");
        // Using .empty method of Optional class.
        Optional<Object> empty = Optional.empty();
        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());

        System.out.println("************** of() method example******************");

        // Using of method of Optional class.
        Optional<String> ofMethod = Optional.of("Java is my favourite");
        System.out.println(ofMethod.isPresent());
        System.out.println(ofMethod.isEmpty());

        // Using ofNullable() method of Optional class.
        System.out.println("************ ofNullable() method example************");
        Optional<String> ofNullable = Optional.ofNullable("Heyy!!");
        System.out.println(ofNullable);


        // Using get() of Optional class to print whatever present in given input string.
        System.out.println("************** get() method example ****************");
        Optional<String> getMethod = Optional.ofNullable(str);
        System.out.println(getMethod.isPresent());
        System.out.println(getMethod.get());

        // Using orElse() method of Optional class.
        String str2 = null;
        System.out.println("*********** orElse() method example ***********");
        Optional<String> optional1 = Optional.ofNullable(str2);
        System.out.println(optional1.orElse("No value in this object"));

    }
}
