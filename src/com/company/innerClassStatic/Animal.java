package com.company.innerClassStatic;

/**
 * Created by ngoct on 8/23/2019.
 */
public class Animal {

    //inner class
    public class Dog {
        private int ten;

        public void hello() {
            System.out.println("Hello");
        }
    }

    public class Husky extends Dog{

    }

    public static void main(String[] args) {
        Animal an = new Animal();

        Animal.Dog d = an.new Dog();
        d.hello();
    }

}
