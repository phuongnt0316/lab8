package baith1;

import java.util.Scanner;

public class Rectangle extends Shape{
    float width;
    float height;
    @Override
    public void inputData() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chieu rong:");
        width=Float.parseFloat(sc.nextLine());
        System.out.println("Nhap chieu cao:");
        height=Float.parseFloat(sc.nextLine());

    }

    @Override
    public void calArea() {
        float area=width*height;
        System.out.printf("Dien tich tu giac la: %.2f",area);

    }
}
