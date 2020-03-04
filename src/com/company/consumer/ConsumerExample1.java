package com.company.consumer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class ConsumerExample1 {

    static void printValue(int val) {
        System.out.println(val);
    }

    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("Hello, " + name);
            }
        };
        // Calling Consumer method
        consumer.accept("gpcoder"); // Hello, gpcoder

        // Create Consumer interface with lambda expression
        Consumer<String> consumer1 = (name) -> System.out.println("Hello, " + name);
        // Calling Consumer method
        consumer1.accept("gpcoder"); // Hello, gpcoder

        // Create Consumer interface with method reference
        Consumer<Integer> consumer2 = ConsumerExample1::printValue;
        // Calling Consumer method
        consumer2.accept(12); // 12


        System.out.print("IntConsumer: ");
        int[] intNumbers = { 3, 5, 6, 2, 1 };
        IntConsumer intConsumer = i -> System.out.print(i + " ");
        Arrays.stream(intNumbers).forEach(intConsumer);

        System.out.print("\nLongConsumer: ");
        long[] longNumbers = { 3, 5, 6, 2, 1 };
        LongConsumer longConsumer = l -> System.out.print(l + " ");
        Arrays.stream(longNumbers).forEach(longConsumer);

        System.out.print("\nDoubleConsumer: ");
        double[] dbNumbers = { 3.2, 5.1, 6.3, 2.5, 1.0 };
        DoubleConsumer dbConsumer = d -> System.out.print(d + " ");
        Arrays.stream(dbNumbers).forEach(dbConsumer);

        //BiConsumerExample
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 5);
        map.put("PHP", 2);
        map.put("C#", 1);

        BiConsumer<String, Integer> biConsumer =
                (key, value) -> System.out.println("Key: " + key + " - Value: " + value);
        map.forEach(biConsumer);
    }

}
