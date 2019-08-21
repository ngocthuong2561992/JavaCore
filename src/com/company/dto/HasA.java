package com.company.dto;

/**
 * Created by ngoct on 8/22/2019.
 */
public class HasA {
    private String ten;
    private DiaChi diaChi; // HAS_A ; moi person has a dia chi

    public HasA(String ten) {
        super();
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public DiaChi getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }

    public void Chay() {
        System.out.println("OK  hee class Cha");
    }
}

