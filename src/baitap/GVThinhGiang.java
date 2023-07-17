package baitap;

import java.util.Scanner;

public class GVThinhGiang extends GiangVien{
    String tenCoQuan;

    @Override
    public void nhap() {

        System.out.println("Nhap giang vien thinh giang:");
        super.nhap();
        System.out.println("Nhap ten co quan:");
        Scanner sc=new Scanner(System.in);
        tenCoQuan=sc.nextLine();
    }

    @Override
    public void xuat() {
        System.out.print("GVTG-");
        super.xuat();
        System.out.println(tenCoQuan);
    }
    public int tinhluong(){
        int luong=0;
        luong=getSoGio()*200;
        return luong;
    }
}
