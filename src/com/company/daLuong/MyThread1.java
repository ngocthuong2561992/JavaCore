package com.company.daLuong;

/**
 * Created by ThuongPham on 23/08/2019.
 */
public class MyThread1 implements Runnable {

    @Override
    public void run() {
        for (int i=0 ; i<10; i++) {
            System.out.println("A" + i);
        }
    }
}
