package com.company.exception;

/**
 * Created by ngoct on 8/23/2019.
 */
public class Hello {
    public static void main(String[] args) {
        int[] mang = {1,2};
        try {
            System.out.println(mang[2]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("loi 1");
        } catch (Exception ex) {
            System.out.println("loi 2");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("loi 3");
    }
}
