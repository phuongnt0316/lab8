package baitap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GVCoHuu extends GiangVien{
    private int luong;
    private int gioQuyDinh;

    @Override
    public void nhap() {
        System.out.println("Nhap giang vien co huu");
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap luong co ban");
        luong=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so gio quy dinh");
        gioQuyDinh=Integer.parseInt(sc.nextLine());

    }

    @Override
    public void xuat() {
        System.out.print("GVCH-");
        super.xuat();
        System.out.print(luong+"-"+gioQuyDinh+"\n");
    }
}
