package baitap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;
@Data
@NoArgsConstructor
public class GVThinhGiang extends GiangVien{
    String tenCoQuan;

    public GVThinhGiang(String tenGV, String email, String diaChi, String dienThoai, int soGio, String tenCoQuan) {
        super(tenGV, email, diaChi, dienThoai, soGio);
        this.tenCoQuan = tenCoQuan;
    }

    public GVThinhGiang(String tenCoQuan) {
        this.tenCoQuan = tenCoQuan;
    }

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
