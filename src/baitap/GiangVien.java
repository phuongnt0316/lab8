package baitap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class GiangVien {
    private  String tenGV;
    private String email;
    private String diaChi;
    private String dienThoai;
    private int soGio;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten giang vien: ");
        tenGV=sc.nextLine();
        System.out.println("Nhap email:");
        email=sc.nextLine();
        System.out.println("Nhap dia chi:");
        diaChi=sc.nextLine();
        System.out.println("Nhap so dien thoai");
        dienThoai=sc.nextLine();
        System.out.println("Nhap so gio giang day");
        soGio=Integer.parseInt(sc.nextLine());


    }
    public abstract int tinhluong();
    public void xuat(){
        System.out.print(tenGV+"-"+email+"-"+diaChi+"-"+dienThoai+"-"+soGio+"-");
    }
}
