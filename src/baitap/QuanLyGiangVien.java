package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyGiangVien {
    public static List<GiangVien> giangvien = new ArrayList<>();

    public static int showMenu() {
        boolean flag=true;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Nhap vao thong tin cua giang vien");
            System.out.println("2. Xuat danh sach toan bo giang vien");
            System.out.println("3. Xuat danh sach giang vien co huu");
            System.out.println("4. Xuat danh sach giang vien thinh giang");
            System.out.println("5. Tinh tong tien luong cua toan bo giang vien");
            System.out.println("6. Tim giang vien co tong luong cao nhat");
            System.out.println("7. Ket thuc");
            System.out.println("Nhap chuc nang 1-7");
            try {
                Scanner sc = new Scanner(System.in);
                return Integer.parseInt(sc.nextLine());

            } catch (Exception e) {
                System.out.println("Nhap so: ");
            }


        }while (flag);
        return 0;
    }

        public static void nhapThongTin() {
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
                    System.out.println("Nhap so 1-7: ");
                    break;
            }
        } while (flag);


    }

     public static void  xuatDanhSach() {
        for (GiangVien item : giangvien) {
            item.xuat();

        }
    }

    public static void xuatGiangVienCoHuu() {
        for (GiangVien item : giangvien) {
            if (item instanceof GVCoHuu) {
                item.xuat();
            }
        }
    }

    public static void xuatGiangVienThinhGiang() {
        for (GiangVien item : giangvien) {
            if (item instanceof GVThinhGiang) {
                item.xuat();
            }
        }
    }

   public static int tongLuong() {
        int sum = 0;
        for (GiangVien item : giangvien) {
            if (item instanceof GVCoHuu) {
                GVCoHuu ch =(GVCoHuu) item;
                sum += ch.tinhluong();

            } else {
                GVThinhGiang tg = (GVThinhGiang) item;
                sum += tg.tinhluong();
            }
        }
        return sum;
    }

   public static int max() {
        int max = 0;
        for (GiangVien item : giangvien) {
            if (item instanceof GVCoHuu) {
                if ( ((GVCoHuu) item).tinhluong() > max) max = ((GVCoHuu) item).tinhluong();

            } else {
                if (((GVThinhGiang)item).tinhluong() > max) max = ((GVThinhGiang)item).tinhluong();
            }
        }
        return max;
    }


    public static void main(String[] args) {
        GVThinhGiang gv=new GVThinhGiang("1","1","1","1",30,"1");
        GVThinhGiang gv2=new GVThinhGiang("2","1","1","1",20,"1");
        GVCoHuu ch=new GVCoHuu("3","2","2","2",60,2000,40);
        GVCoHuu ch2=new GVCoHuu("4","2","2","2",40,2000,40);
        giangvien.add(gv);
        giangvien.add(gv2);
        giangvien.add(ch);
        giangvien.add(ch2);
        boolean flag=true;
        do{
           int n=showMenu();
           switch (n){
               case 1:
                   nhapThongTin();
                   break;
               case 2:
                   xuatDanhSach();
                   break;
               case 3:
                   xuatGiangVienCoHuu();
                   break;
               case 4:
                   xuatGiangVienThinhGiang();
                   break;
               case 5:
                   System.out.println("Tong luong:"+tongLuong());
                   break;
               case 6:
                   System.out.println("Luong cao nhat: "+max());
                   System.out.println("Danh sach nhan vien luong cao nhat");
                   for (GiangVien item : giangvien) {
                       if (item instanceof GVCoHuu) {
                           if ( ((GVCoHuu) item).tinhluong() ==max()) item.xuat();

                       } else {
                           if (((GVThinhGiang)item).tinhluong() == max())  item.xuat();
                       }
                   }
                   break;
               case 7:
                   System.out.println("Ket thuc");
                   flag=false;
                   break;
               default:
                   System.out.println("nhap lai");
                   break;
           }
        }while (flag);


    }
}
