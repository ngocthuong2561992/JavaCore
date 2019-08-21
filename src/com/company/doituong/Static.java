package com.company.doituong;

/**
 * Created by ngoct on 8/22/2019.
 */
public class Static {
    static int count = 0 ;
    public static int ChuVi(int chieuDai, int chieuRong) {
        return (chieuDai*chieuRong)*2;
    }

    public static void main(String[] args) {
        System.out.println(Static.count);
        Static.count +=1;
        System.out.println(Static.count);
        System.out.println(Static.ChuVi(6,6));

        Static hinh1 = new Static();
        hinh1.count = 5;
        System.out.println(Static.count);

    }

}
