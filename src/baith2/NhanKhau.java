package baith2;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NhanKhau {
    private String hoten;
    private  String ngaysinh;
    private  boolean gioitinh;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        this.hoten=sc.nextLine();
        System.out.println("Nhap ngay sinh:");
        this.ngaysinh=sc.nextLine();
        System.out.println("Nhap gioi tinh: Nam/Nu");
        String gender=sc.nextLine();
        if("nam".equalsIgnoreCase(gender)){
            this.gioitinh=true;
        }
        else {
            this.gioitinh=false;
        }


    }
    public void hienthi(){
        System.out.println("Nhan Khau:");
        System.out.println("Ho ten\t\t"+hoten);
        System.out.println("Ngay sinh\t\t"+ngaysinh);
        System.out.println("Gioi tinh\t\t"+gioitinh);
    }


}
