package baith1;

import java.util.Scanner;

public class Main {
    public int showMenu(){
        System.out.println("---MENU---");
        System.out.println("1.Tinh dien tich hinh tron");
        System.out.println("2.Tinh dien tich tu giac");
        System.out.println("3,Tinh dien dich tam giac");
        System.out.println("Chon 1-3");
        Scanner sc=new Scanner(System.in);
        return (int) Float.parseFloat(sc.nextLine());
    }
    public void tinhDienTich(Shape hinh){
        hinh.inputData();
        hinh.calArea();
    }

    public static void main(String[] args) {
        Main main=new Main();
        int i=0;
        do{
            i=main.showMenu();
            switch (i){
                case 1:
                    main.tinhDienTich(new Circle());
                    break;
                case 2:
                    main.tinhDienTich(new Rectangle());
                    break;
                case 3:
                    main.tinhDienTich(new Tritangle());
                    break;

            }
        }while (i>0&&i<=3);
        System.out.println("Ket thuc");
    }
}
