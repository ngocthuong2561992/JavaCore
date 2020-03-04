package com.company.optional;

import java.util.Optional;

class Student {
    String name;
}

public class OptionalExample1 {

    public static void preJava8() {
        Student student = getStudent();
        if (student != null) {
            System.out.println(student.name);
        }
    }

    public static void java8() {
        Student student = getStudent();
        Optional<Student> opt = Optional.of(student);
        if (opt.isPresent()) {
            System.out.println(opt.get().name);
        }
        // opt.ifPresent(s -> System.out.println(s.name));
    }

    private static Student getStudent() {
        Student student = new Student();
        student.name = "gpcoder.com";
        return null;
    }

    public static void main(String[] args) {
        java8();
    }
}
