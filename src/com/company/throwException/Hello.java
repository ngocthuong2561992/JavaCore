package com.company.MyException;


import com.company.throwException.MyException;

/**
 * Created by ngoct on 8/23/2019.
 */
public class Hello {

    public static void main(String[] args) {
        try {
            chia2So(4,5);
        } catch (MyException e) {
            System.out.println(e.getError());
        }
    }

    public static void chia2So(int a, int b) throws MyException {
        try {
            int kq = a/b;
        } catch (Exception e) {
            throw new MyException("loi chia cho khong");
        }
    }
}
