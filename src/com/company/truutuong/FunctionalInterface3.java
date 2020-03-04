package com.company.truutuong;

interface BaseInterface1 {
    void base();
}

interface BaseInterface2 {
    void base();
}

@java.lang.FunctionalInterface
public interface FunctionalInterface3 extends BaseInterface1, BaseInterface2  {

}
