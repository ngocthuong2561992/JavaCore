package com.company.dto;

/**
 * Created by ngoct on 8/22/2019.
 */
public class Main {
    public static void main(String[] args) {
        Employee emp =  new Employee();
        emp.setTen("A");
        emp.setDiaChi(null);

        DiaChi diaChi =  new DiaChi();
        diaChi.setStreet("HN");

        emp.setDiaChi(diaChi);

        HasA a = new Employee();
        a.Chay();

//        Object obj= new HasA(); //Khong dc
        Object obj= new Employee();
    }
}
