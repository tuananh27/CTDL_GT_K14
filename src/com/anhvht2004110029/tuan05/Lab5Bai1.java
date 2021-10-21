package com.anhvht2004110029.tuan05;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5Bai1 {
    public static void main(String[] args) {
        ArrayList<Double> arrDouble = new ArrayList<Double>();
        arrDouble = nhapMang();
        Xuatmang(arrDouble);
    }

    public static ArrayList<Double> nhapMang(){
        ArrayList<Double> arrDouble = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Nhập số: ");
            Double x = scanner.nextDouble();
            arrDouble.add(x);
            scanner.nextLine();
            System.out.print("Nhập thêm (Y / N) ? ");
            if(scanner.nextLine().equals("N")){
                break;
            }
        }
        return arrDouble;
    }
    public static void Xuatmang(ArrayList<Double> arrDouble){
        System.out.println("Các giá trị của mảng: ");
        double tong = 0;
        for (Double d : arrDouble) {
            System.out.print(d +"\t");
            tong = tong + d;    
        }
        System.out.println("Tổng của mảng: " + tong);
    }

    
}
