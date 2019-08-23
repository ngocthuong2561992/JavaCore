package com.company.throwException;

/**
 * Created by ngoct on 8/23/2019.
 */
public class Person {

    public static void print() throws ArrayIndexOutOfBoundsException {
        int [] mang = { 1,2 };
        System.out.println(mang[2]);
    }

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        try {
            exceptionExample();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ee");
        }
    }

    public static void exceptionExample() {
        throw new ArrayIndexOutOfBoundsException();
    }
}
