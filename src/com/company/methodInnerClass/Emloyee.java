package com.company.methodInnerClass;

import com.company.truutuong.Employee;

/**
 * Created by ngoct on 8/23/2019.
 */
public class Emloyee {

    public void luong() {
        class Worker {
            private String ten;

            public void luong() {
                System.out.println("luong cong nhan");
            }
        }
        Worker w = new Worker();
        w.luong();
    }
}
