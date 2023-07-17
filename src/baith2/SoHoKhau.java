package baith2;

import lombok.Data;

@Data

public class SoHoKhau {
    private int soNhanKhau;
    private HoKhau[] arrThanhVien;

    public SoHoKhau() {
    }

    public SoHoKhau(int soNhanKhau) {
        this.soNhanKhau = soNhanKhau;
        arrThanhVien=new HoKhau[soNhanKhau];
    }
    public void nhapDuLieu(){
        for(int i=0;i<arrThanhVien.length;i++){
            arrThanhVien[i]=new HoKhau();
            arrThanhVien[i].nhap();
        }
    }
    public void hienThi(){
        for(int i=0;i<arrThanhVien.length;i++){
            System.out.println("Thong tin thanh vien "+(i+1));
            HoKhau tv=arrThanhVien[i];
            tv.hienthi();
        }
    }
}
