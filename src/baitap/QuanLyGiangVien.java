package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyGiangVien {
    private List<GiangVien> giangvien = new ArrayList<>();

    public int showMenu() {
        int n;
        System.out.println("-----MENU-----");
        System.out.println("1. Nhap vao thong tin cua giang vien");
        System.out.println("2. Xuat danh sach toan bo giang vien");
        System.out.println("3. Xuat danh sach giang vien co huu");
        System.out.println("4. Xuat danh sach giang vien thinh giang");
        System.out.println("5. Tinh tong tien luong cua toan bo giang vien");
        System.out.println("6. Tim giang vien co tong luong cao nhat");
        System.out.println("7. Ket thuc");
        System.out.println("Nhap chuc nang 1-7");
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        return n;
    }

    public void nhapThongTin() {
        boolean flag = true;
        do {
            System.out.println("1. Nhap giang vien co huu");
            System.out.println("2. Nhap giang vien thinh giang");
            System.out.println("3. Thoat");
            System.out.println("Chon 1 hoac 2");
            int m;
            Scanner sc = new Scanner(System.in);
            m = Integer.parseInt(sc.nextLine());
            switch (m) {
                case 1:
                    GVCoHuu ch = new GVCoHuu();
                    ch.nhap();
                    giangvien.add(ch);
                    break;
                case 2:
                    GVThinhGiang tg = new GVThinhGiang();
                    tg.nhap();
                    giangvien.add(tg);
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Nhap lai: ");
                    break;
            }
        } while (flag);


    }

    void xuatDanhSach() {
        for (GiangVien item : giangvien) {
            item.xuat();

        }
    }

    void xuatGiangVienCoHuu() {
        for (GiangVien item : giangvien) {
            if (item instanceof GVCoHuu) {
                item.xuat();
            }
        }
    }

    void xuatGiangVienThinhGiang() {
        for (GiangVien item : giangvien) {
            if (item instanceof GVThinhGiang) {
                item.xuat();
            }
        }
    }

    int tongLuong() {
        int sum = 0;
        for (GiangVien item : giangvien) {
            if (item instanceof GVCoHuu) {
                GVCoHuu ch = new GVCoHuu();
                sum += ch.tinhluong();

            } else {
                GVThinhGiang tg = new GVThinhGiang();
                sum += tg.tinhluong();
            }
        }
        return sum;
    }

    int max() {
        int max = 0;
        for (GiangVien item : giangvien) {
            if (item instanceof GVCoHuu) {
                GVCoHuu ch = new GVCoHuu();
                if (ch.tinhluong() > max) max = ch.tinhluong();

            } else {
                GVThinhGiang tg = new GVThinhGiang();
                if (tg.tinhluong() > max) max = tg.tinhluong();
            }
        }
        return max;
    }


    public static void main(String[] args) {

    }
}
