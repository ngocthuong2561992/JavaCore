package com.company.innerClass;

/**
 * Created by ngoct on 8/23/2019.
 */
public class Person {
    //inner class
    public static class Kid {
        private int tuoi;

        public void hello() {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        Person.Kid kid = new Person.Kid();
        kid.hello();
    }
}
