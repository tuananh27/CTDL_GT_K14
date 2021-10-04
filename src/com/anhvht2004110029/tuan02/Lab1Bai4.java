package com.anhvht2004110029.tuan02;

import java.util.Scanner;

public class Lab1Bai4 {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        c = scanner.nextDouble();
        delta = Math.pow(b, 2) - 4*a*c;
        if(delta < 0)
            System.out.printf("Phương trình vô nghiệm!");
        else if(delta == 0){
            x1=x2= -b/(2*a);
             System.out.printf("Phương trình có nghiệm kép: %f", x1=x2);
        }
        else{
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.printf("Phương tình có hai nghiệm phân biệt là x1 = %f, x2 = %f", x1, x2);
        }

    }
}
