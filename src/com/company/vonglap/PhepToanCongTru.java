package com.company.vonglap;

public class PhepToanCongTru {

    public static void main(String[] args) {
	// write your code here
        int i = 0;
        //phep cong
        i++; // i=i+1
        inKQ(i);
        //phep tru
        ++ i; //
        inKQ(i);
        //phep tru
        i--;
        inKQ(i);
        --i;
        inKQ(i);
    }

    public static void inKQ(int i) {
        System.out.println(i);
    }
}
