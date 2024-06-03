// 715105259 Nguyễn Mạnh Tuấn
// SBD: 145 - Đề 1
package com.mycompany._nguyenmanhtuan;

import java.util.Scanner;

public class PhanLoai {
    private String loai;
    private int soLuong;

    public PhanLoai() {
    }

    public PhanLoai(String loai, int soLuong) {
        this.loai = loai;
        this.soLuong = soLuong;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "PhanLoai{" + "loai=" + loai + ", soLuong=" + soLuong + '}';
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap loai (co ban - nang cao): ");
        loai = sc.nextLine();
        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();
    }
}
