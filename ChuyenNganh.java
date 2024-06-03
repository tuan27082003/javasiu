// 715105259 Nguyễn Mạnh Tuấn
// SBD: 145 - Đề 1
package com.mycompany._nguyenmanhtuan;

import java.util.Scanner;

public class ChuyenNganh {
    private String maChuyenNganh, tenChuyenNganh;

    public ChuyenNganh() {
    }

    public ChuyenNganh(String maChuyenNganh, String tenChuyenNganh) {
        this.maChuyenNganh = maChuyenNganh;
        this.tenChuyenNganh = tenChuyenNganh;
    }

    public ChuyenNganh(String tenChuyenNganh) {
        this.tenChuyenNganh = tenChuyenNganh;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma chuyen nganh: ");
        maChuyenNganh = sc.nextLine();
        System.out.print("Nhap ten chuyen nganh: ");
        tenChuyenNganh = sc.nextLine();
    }

    public String getMaChuyenNganh() {
        return maChuyenNganh;
    }

    public void setMaChuyenNganh(String maChuyenNganh) {
        this.maChuyenNganh = maChuyenNganh;
    }

    public String getTenChuyenNganh() {
        return tenChuyenNganh;
    }

    public void setTenChuyenNganh(String tenChuyenNganh) {
        this.tenChuyenNganh = tenChuyenNganh;
    }

    @Override
    public String toString() {
        super.toString();
        return "ChuyenNganh{ " + "maChuyenNganh = " + maChuyenNganh + ", tenChuyenNganh=" + tenChuyenNganh + '}';
    }
    
}
