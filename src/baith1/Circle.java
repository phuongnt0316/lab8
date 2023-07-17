package baith1;

import java.util.Map;
import java.util.Scanner;

public class Circle extends Shape{
    float radius;
    @Override
    public void inputData() {
        System.out.println("Nhap ban kinh hinh tron:");
        Scanner sc=new Scanner(System.in);
        radius=Float.parseFloat(sc.nextLine());
    }

    @Override
    public void calArea() {
        float area=(float)(radius*radius* Math.PI);
        System.out.printf("Dien tich hinh tron ;a :%.2f",area);

    }
}
