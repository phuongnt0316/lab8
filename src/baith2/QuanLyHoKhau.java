package baith2;

import java.util.Scanner;

public class QuanLyHoKhau {
    private SoHoKhau[] arrSoHoKhau;
    public int showMenu(){
        System.out.println("--MENU--");
        System.out.println("1.Khai bao so ho khau");
        System.out.println("2.Danh sach so ho khau");
        System.out.println("3.Tim nguoi");
        System.out.println("Nhap 1-3");
        Scanner sc=new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }
    public void khaibaoSHK(){
        Scanner sc=new Scanner(System.in);
        System.out.println("--Khai bao so ho khau-- ");
        System.out.println("Nhap so ho khau:");
        arrSoHoKhau=new SoHoKhau[Integer.parseInt(sc.nextLine())];
        for(int i=0;i<arrSoHoKhau.length;i++) {
            System.out.println("Nhap so nhan khau ho thu " + (i + 1));
            Scanner in=new Scanner(System.in);
            arrSoHoKhau[i]=new SoHoKhau(Integer.parseInt(in.nextLine()));
            arrSoHoKhau[i].nhapDuLieu();

        }
        System.out.println("end");
    }
    public  void danhsachSHK(){
        System.out.println("Danh sach so ho khau");
        for (int i=0;i<arrSoHoKhau.length;i++){
            System.out.println("So ho khau thu "+(i+1));
            arrSoHoKhau[i].hienThi();

        }
    }
    public void timNguoi(String name){
       boolean flag=false;
        for (int i = 0; i < arrSoHoKhau.length; i++) {
            SoHoKhau shk=new SoHoKhau();
            shk=arrSoHoKhau[i];
            for (int j = 0; j < shk.getArrThanhVien().length; j++) {
                HoKhau hk=new HoKhau();
                hk=shk.getArrThanhVien()[j];
                if(hk.getHoten().equals(name)){
                    arrSoHoKhau[i].hienThi();
                    flag=true;
                    break;
                }

            }


        }
        if(flag==false){
            System.out.println("Khong tim thay!");
        }

    }

    public static void main(String[] args) {
        int i=0;
        QuanLyHoKhau quanLyHoKhau=new QuanLyHoKhau();
        do {
            i = quanLyHoKhau.showMenu();
            switch (i) {
                case 1:
                    quanLyHoKhau.khaibaoSHK();
                    break;
                case 2:
                    quanLyHoKhau.danhsachSHK();
                    break;
                case 3:
                    String name;
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Nhap ten ho ten can tim kiem");
                    name=sc.nextLine();
                    quanLyHoKhau.timNguoi(name);
                    break;
            }

        }while (i>0&&i<=3);
        System.out.println("end!");
    }
}
