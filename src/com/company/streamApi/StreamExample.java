package com.company.streamApi;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

     public static void main(String[] args) {
         List<Integer> numbers = Arrays.asList(7, 2, 5, 4, 2, 1);
         long count = numbers.stream().filter(num -> num % 2 == 0).count();
         System.out.printf("There are %d elements that are even", count);
    }
}
