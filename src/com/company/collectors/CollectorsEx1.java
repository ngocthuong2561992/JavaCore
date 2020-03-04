package com.company.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsEx1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "C++", "C#", "PHP");

        String result6 = list.stream().collect(Collectors.joining());
        System.out.println(result6);
        String result7 = list.stream().collect(Collectors.joining(", "));
        System.out.println(result7);
        String result8 = list.stream().collect(Collectors.joining(" ", "PRE-", "-POST"));
        System.out.println(result8);
        Long result9 = list.stream().collect(Collectors.counting()); // => 4
        System.out.println(result9);
    }
}
