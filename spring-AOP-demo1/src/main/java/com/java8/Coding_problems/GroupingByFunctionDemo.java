package com.java8.Coding_problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByFunctionDemo {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee("Ilyas", 01, 20),
                new Employee("Zeeshan", 02, 30),
                new Employee("Armaan", 03, 20),
                new Employee("Kareem", 04, 28),
                new Employee("Sajid", 05, 20),
                new Employee("Ghouse", 06, 30),
                new Employee("Shahbaz", 07, 32));

        // group all the employees by their names. just printing out only sting names, not the whole Employee object
        Map<Integer, List<String>> groupByName = employeeList.stream().collect(Collectors.groupingBy(age -> age.getAge(),
                Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(groupByName);


        // group all the employees who are having same age.
        /*Map<Integer, List<Employee>> groupByAge = employeeList.stream()
                .collect(Collectors.groupingBy(age -> age.getAge()));
        System.out.println(groupByAge);*/
    }

}
