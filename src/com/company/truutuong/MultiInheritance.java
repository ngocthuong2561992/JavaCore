package com.company.truutuong;

interface Interface1 {
    default void doSomething() {

    }
}

interface Interface2 {
    default void doSomething() {

    }
}

public class MultiInheritance implements Interface1, Interface2 {

    @Override
    public void doSomething() {
        Interface1.super.doSomething();
    }

}