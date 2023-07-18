package baitap;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@NoArgsConstructor
public class GVCoHuu extends GiangVien{
    private int luongcoban;
    private int gioQuyDinh;

    public GVCoHuu(String tenGV, String email, String diaChi, String dienThoai, int soGio, int luongcoban, int gioQuyDinh) {
        super(tenGV, email, diaChi, dienThoai, soGio);
        this.luongcoban = luongcoban;
        this.gioQuyDinh = gioQuyDinh;
    }

    public GVCoHuu(int luongcoban, int gioQuyDinh) {
        this.luongcoban = luongcoban;
        this.gioQuyDinh = gioQuyDinh;
    }

    @Override
    public void nhap() {
        System.out.println("Nhap giang vien co huu");
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap luong co ban");
        luongcoban=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so gio quy dinh");
        gioQuyDinh=Integer.parseInt(sc.nextLine());

    }

    @Override
    public void xuat() {
        System.out.print("GVCH-");
        super.xuat();
        System.out.print(luongcoban+"-"+gioQuyDinh+"\n");
    }
    public int tinhluong(){
        int luong=0;
        luong=getSoGio()<gioQuyDinh?getLuongcoban():(getLuongcoban()+(getSoGio()-gioQuyDinh)*200);
        return luong;
    }
}
