package com.company.outerclass;

/**
 * Created by ngoct on 8/22/2019.
 */
public class Person {

    public void xinChao() {
        Kid kid = new Kid();
        kid.xinChao();
    }
}

//outer class
class Kid {
    private int tuoi;

    public void xinChao() {
        System.out.println("Xin chao");
    }

}
