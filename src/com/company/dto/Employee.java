package com.company.dto;

/**
 * Created by ngoct on 8/22/2019.
 */
public class Employee extends HasA{
    // loi ben hasA khai bao khac
//    public Emloyee () {
//
//    }

    public Employee() {
        super("A");
    }

    public Employee(String ten) {
        super(ten);
    }

    public void Chay() {
        System.out.println("OK  hee class Con");
    }
}
