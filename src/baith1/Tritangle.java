package baith1;

import java.util.Scanner;

public class Tritangle extends Shape{
    float height;
    float bottom;
    @Override
    public void inputData() {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Nhap chieu cao:");
        height=Float.parseFloat(sc.nextLine());
        System.out.println("Nhap canh day: ");
        bottom=Float.parseFloat(sc.nextLine());

    }

    @Override
    public void calArea() {
        float area=(bottom*height)/2;
        System.out.printf("Dien tich tam giac la: %.2f ",area);

    }
}
