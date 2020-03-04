package com.company.consumer;

import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.List;

class Programing {
    public String language;
    public int experience;

    public Programing(String language, int experience) {
        this.language = language;
        this.experience = experience;
    }

    public void print() {
        System.out.println("Language: " + language + " - Experience: " + experience);
    }
}

public class ConsumerAndThenExample {
    public static final int TEST_NUMBER = 5;

    public static void main(String[] args) {
        Consumer<Integer> times2 = (e) -> System.out.println(e * 2);
        Consumer<Integer> squared = (e) -> System.out.println(e * e);
        Consumer<Integer> isOdd = (e) -> System.out.println(e % 2 == 1);

        // perform every consumer
        times2.accept(TEST_NUMBER); // 10
        squared.accept(TEST_NUMBER); // 25
        isOdd.accept(TEST_NUMBER); // true

        // perform 3 methods in sequence
        Consumer<Integer> combineConsumer = times2.andThen(squared).andThen(isOdd);
        combineConsumer.accept(TEST_NUMBER); // 10 25 true

        List<Programing> list = new ArrayList<>();
        list.add(new Programing("Java", 5));
        list.add(new Programing("PHP", 2));
        list.add(new Programing("C#", 1));

        // Creating instance of Consumer functional interface
        Consumer<Programing> consumer = (p) -> System.out.println(
                "Name: " + p.language + " - Experience: " + p.experience);

        System.out.println("Using Consumer: ");
        list.forEach(consumer);

        System.out.println("\nUsing Method Reference: ");
        list.forEach(Programing::print);

        System.out.println("\nUsing Lambda Expression: ");
        list.forEach(s -> s.print());
    }
}
