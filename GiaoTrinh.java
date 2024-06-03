// 715105259 Nguyễn Mạnh Tuấn
// SBD: 145 - Đề 1
package com.mycompany._nguyenmanhtuan;

import java.util.Scanner;


public class GiaoTrinh extends ChuyenNganh {
    private String tenGiaoTrinh;
    private int gia;
    private PhanLoai phanLoai;

    public GiaoTrinh() {
    }
    
    public GiaoTrinh(String tenGiaoTrinh, int gia, PhanLoai phanLoai, String maChuyenNganh, String tenChuyenNganh) {
        super(maChuyenNganh, tenChuyenNganh);
        this.tenGiaoTrinh = tenGiaoTrinh;
        this.gia = gia;
        this.phanLoai = phanLoai;
    }

    public GiaoTrinh(String tenGiaoTrinh, int gia, PhanLoai phanLoai, String tenChuyenNganh) {
        super(tenChuyenNganh);
        this.tenGiaoTrinh = tenGiaoTrinh;
        this.gia = gia;
        this.phanLoai = phanLoai;
    }

    public GiaoTrinh(String tenGiaoTrinh, PhanLoai phanLoai, String tenChuyenNganh) {
        super(tenChuyenNganh);
        this.tenGiaoTrinh = tenGiaoTrinh;
        this.phanLoai = phanLoai;
    }
    
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap ten giao trinh: ");
        tenGiaoTrinh = sc.nextLine();
        System.out.print("Nhap gia: ");
        gia = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng trống sau khi đọc số nguyên
        phanLoai = new PhanLoai();
        phanLoai.nhap();
    }

    public String getTenGiaoTrinh() {
        return tenGiaoTrinh;
    }

    public void setTenGiaoTrinh(String tenGiaoTrinh) {
        this.tenGiaoTrinh = tenGiaoTrinh;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public PhanLoai getPhanLoai() {
        return phanLoai;
    }

    public void setPhanLoai(PhanLoai phanLoai) {
        this.phanLoai = phanLoai;
    }
}
