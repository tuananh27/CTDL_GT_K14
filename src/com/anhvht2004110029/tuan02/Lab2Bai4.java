package com.anhvht2004110029.tuan02;

import java.util.Scanner;

public class Lab2Bai4 {
    public static void main(String[] args) {
        System.out.println("|-------------Menu------------|");
        System.out.println("| 1. Giải phương trình bậc I  |");
        System.out.println("| 2. Giải phương trình bậc II |");
        System.out.println("|3. Tính tiền điện            |");
        System.out.println("|-------------Menu------------|");
        int suLuaChon;
        System.out.print("Lựa chọn chức năng:");
        Scanner bienNhap;       
        bienNhap = new Scanner(System.in);
        suLuaChon = bienNhap.nextInt();

        switch(suLuaChon){
            case 1: giaiPTBacI(); break;
            case 2: giaiPTBacII(); break;
            case 3: tinhTienDien(); break;
            default: System.out.println("Chọn chức năng khác");
        }
    }

    static void giaiPTBacI(){
        float a = 0, b = 0, x;
        
        if(a == 0){
            if(b == 0)
                System.out.println("PT vô số nghiệm ");
            else
                System.out.println("PT vô nghiệm ");
        }
        else {
            x = -b/a;
            System.out.printf("PT có nghiệm: x = %f", x);
        }
    }

    
    static void giaiPTBacII(){
        double a, b, c, x, x1, x2, delta;
       Scanner scanner = new Scanner(System.in);
       System.out.print("Nhập a: ");
       a = scanner.nextDouble();
       System.out.print("Nhập b: ");
       b = scanner.nextDouble(); 
       System.out.print("Nhập c: ");
       c = scanner.nextDouble();
       if(a == 0){
            x = -b/c;
            System.out.printf("Nghiệm phương trình bậc nhất: x=%.1f", x);
        }
      
        if(a != 0){
            delta = Math.pow(b, 2) - 4*a*c;
            if(delta < 0)
                System.out.printf("Phương tình vô nghiệm!");
            
            else if(delta == 0){
                x1=x2= -b/(2*a);
                System.out.printf("Phương trình có nghiệm kép: x1=x2= %.1f", x1=x2);
            }
        
            else if(delta > 0){
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.printf("Phương trình có 2 nghiệm phân biệt: x1= %.1f, x2= %.1f", x1, x2);
            }
        
        }
    }

    static void tinhTienDien(){
        Scanner scanner = new Scanner(System.in);
        double sodien, tiendien;
        System.out.print("Số điện tiêu thụ: ");
        sodien = scanner.nextDouble();
        if(sodien <= 50){
            tiendien = sodien * 1000;
            System.out.printf("Tiền điện của tháng: tiendien = %.1f", tiendien);

        }else{
            tiendien = (50*1000) + ((sodien-50) * 1200 );
            System.out.printf("Tiền điện của tháng: tiendien = %.1f", tiendien);
        }
    }
    
}
