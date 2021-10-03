package com.anhvht2004110029.tuan04;

import java.util.Scanner;

public class ComputertestDrive {
    public static void main(String[] args) {
        Computer[] computerlist = new Computer[2];
        Scanner bienNhap = new Scanner(System.in);
        for(int i = 0; i < computerlist.length; i++){
            System.out.print("Nhà sản xuất: ");
            String nha = bienNhap.nextLine();
            System.out.print("Năm sản xuất: ");
            String nam = bienNhap.nextLine();
            System.out.print("Hệ điều hành: ");
            String he = bienNhap.nextLine();
            System.out.print("Ram: ");
            String r = bienNhap.nextLine();
            System.out.print("CPU: ");
            String c = bienNhap.nextLine();
            System.out.print("Giá sản phẩm: ");
            String g = bienNhap.nextLine();
            System.out.print("Năm bảo hành: ");
            String n = bienNhap.nextLine();
            bienNhap.nextLine();
            computerlist[i] = new Computer(nha, nam, he, r, c, g, n);

        }

        System.out.println("---Thông tin máy tính---");
         
        for (Computer computer : computerlist) {
            computer.intThongtinPC();
            
        }
        
    }
    
}
