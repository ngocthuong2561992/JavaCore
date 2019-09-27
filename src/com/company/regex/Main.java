package com.company.regex;

/**
 * Created by ThuongPham on 25/09/2019.
 */
public class Main {
    //B17DCCN076,B17DT123,B14KT124
    public static void main(String[] args) {
        String chuoiText ="B17DCCN076";
        String id = "^B[0-9]{2,3}[a-zA-Z]{0,}[0-9]{0,}";
        if (!chuoiText.matches(id)) {
            System.out.println("Dung chuoi nhap user");
        } else {
            System.out.println("Sai chuoi nhap user");
        }
        //hanh2499
        String pass1 = "hanh2499";
        String pass = "[a-zA-Z0-9]";
        if (!pass1.matches(pass)) {
            System.out.println("Dung chuoi nhap password");
        }
        String data = "Hom    nay troi dep qua";
//        String [ ] str = data.split(" ");
        String [ ] str = data.split("\\s+");
        //+ : 1 hoac nhieu
        for(String e : str) {
            System.out.println(e);
        }

        String data1 = "Hom.nay.troi.dep.qua";
//        String [ ] str = data.split(" ");
        String [ ] str1 = data1.split("\\.");
        //+ : 1 hoac nhieu
        for(String e1 : str1) {
            System.out.println(e1);
        }

        String data2 = "Hom345nay567troi789dep123qua";
//        String [ ] str = data.split(" ")
        //ki tu khong phai la so
        System.out.println(data2.replaceAll("\\D",""));
        System.out.println(data2.replaceAll("[^0-9]",""));
        System.out.println(data2.replaceAll("[\\d]",""));
        System.out.println(data2.replaceAll("[\\d]",""));

    }


}
