package com.company.wrapper;

/**
 * Created by ngoct on 8/22/2019.
 */
public class Wrapper {
    public static void main(String[] args) {
        int x = 10 ;
        Integer y = new Integer(10);

        int z = x+y;
        System.out.println(z);

        int x1= 10; int x2= 10;
        Integer x3 = 10;

        System.out.println(x1==x2);
        System.out.println(x1==x3);

        Integer k1 = new Integer(10);
        Integer k2 = new Integer(10);
        int k3 = 10;

        System.out.println(k1==k2);
        System.out.println(k1.equals(k2));

        System.out.println(k1==k3);
        System.out.println(k1.equals(k3));
    }
}
