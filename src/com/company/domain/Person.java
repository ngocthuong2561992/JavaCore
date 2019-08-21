package com.company.domain;

/**
 * Created by ngoct on 8/22/2019.
 */
public class Person{
    private String ten;
    private String ho;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setHoTen(String ho,String ten) {
        this.ho = ho;
        this.ten = ten;
    }

    public String getFullName() {
        return this.ho + " " + this.ten;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }
}
