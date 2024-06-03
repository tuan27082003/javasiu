// 715105259 Nguyễn Mạnh Tuấn
// SBD: 145 - Đề 1
package com.mycompany._nguyenmanhtuan;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main_715105259 {
    public static void main(String[] args) throws IOException {     
        Scanner scanner = new Scanner(System.in);
        List<GiaoTrinh> danhSachGiaoTrinh = new ArrayList<>();

        // Nhập thông tin và lưu vào file giaotrinh.txt
        System.out.print("Nhap so luong giao trinh (N): ");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống sau khi đọc số nguyên

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap thong tin giao trinh thu " + (i + 1) + ":");
            GiaoTrinh giaoTrinh = new GiaoTrinh();
            giaoTrinh.nhap();
            danhSachGiaoTrinh.add(giaoTrinh);
        }

        ghiFile(danhSachGiaoTrinh);

        // Đọc dữ liệu từ file giaotrinh.txt và hiển thị
        System.out.println("\nDanh sach giao trinh tu file giaotrinh.txt:");
        docVaHienThiFile();

        // Đếm số lượng giáo trình thuộc loại "Nang cao"
        int countNangCao = demGiaoTrinhNangCao(danhSachGiaoTrinh);
        System.out.println("\nSo giao trinh thuoc loai \"Nang cao\": " + countNangCao);

        // Sắp xếp giảm dần giá của giáo trình và in ra màn hình
        Collections.sort(danhSachGiaoTrinh, Comparator.comparingInt(GiaoTrinh::getGia).reversed());
        System.out.println("\nDanh sach giao trinh giam dan theo gia:");
        for (GiaoTrinh giaoTrinh : danhSachGiaoTrinh) {
            System.out.println(giaoTrinh);
        }
    }

    private static void ghiFile(List<GiaoTrinh> danhSachGiaoTrinh) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("giaotrinh.txt"))) {
            for (GiaoTrinh giaoTrinh : danhSachGiaoTrinh) {
                writer.println(giaoTrinh);
            }
        } catch (IOException e) {
        }
    }

    private static void docVaHienThiFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("giaotrinh.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
        }
    }

    private static int demGiaoTrinhNangCao(List<GiaoTrinh> danhSachGiaoTrinh) {
        int count = 0;
        for (GiaoTrinh giaoTrinh : danhSachGiaoTrinh) {
            if (giaoTrinh.getPhanLoai().getLoai().equalsIgnoreCase("nang cao")) {
                count++;
            }
        }
        return count;
    }
}
