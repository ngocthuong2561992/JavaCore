package com.company.domain;

import sun.security.acl.WorldGroupImpl;

/**
 * Created by ngoct on 8/22/2019.
 */
public class Main {

    public static void main(String[] args) {
//        long x = 10;
//        int i = (int) x;

        Person p = new Person();

        p.setHoTen("A", "B");
        System.out.println(p.getFullName());

//        if (p instanceof Worker) {
//            ((Worker)p) .luong();
//        } else {
//            System.out.println("Khong phai worker");
//        }
//        Person p2 = new Worker();

//        if (p instanceof Worker) {
//            ((Worker)p) .luong();
//        } else {
//            System.out.println("Khong phai worker");
//        }

//        Worker w = new Worker();
//        Employee e = new Worker();
//        Person p = new Worker();
//        Object obj = new Worker();
//        w.luong();
//        Worker k1= (Worker)e;
//        k1.luong();
//        ((Employee) obj).toString();
//        ((Worker)p).luong();
    }
}
