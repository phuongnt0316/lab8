package baith2;

import java.util.Scanner;

public class HoKhau extends NhanKhau{
    private String diaChiHienNay;
    private String noiCongTac;

    public HoKhau(String hoten, String ngaysinh, boolean gioitinh, String diaChiHienNay,String noiCongTac) {
        super(hoten, ngaysinh, gioitinh);
        this.diaChiHienNay = diaChiHienNay;
        this.noiCongTac=noiCongTac;
    }
    public HoKhau(){

    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc=new Scanner((System.in));
        System.out.println("Nhap dia chi thuong tru: ");
        this.diaChiHienNay=sc.nextLine();
        System.out.println("Nhap noi cong tac: ");
        this.noiCongTac=sc.nextLine();
    }

    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println("Dia chi hien nay\t\t"+diaChiHienNay);
        System.out.println("Noi cong tac\t\t"+noiCongTac);

    }

}
