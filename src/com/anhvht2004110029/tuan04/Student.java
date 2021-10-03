package com.anhvht2004110029.tuan04;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Student[] studentlist = new Student[3];

        Scanner bienNhap = new Scanner(System.in);

        System.out.println("Nhập danh sách sinh viên: ");

        for(int i = 0; i < studentlist.length; i++){
            System.out.println("Nhập sinh viên thứ " + (i+1));
            System.out.println("Tên sinh viên: ");
            String name = bienNhap.nextLine();
            System.out.println("Tuổi: ");
            int age = bienNhap.nextInt();
            bienNhap.nextLine();
            

        }
        

    }
    
}
