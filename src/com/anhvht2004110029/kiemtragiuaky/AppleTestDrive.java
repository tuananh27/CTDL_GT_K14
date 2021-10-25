package com.anhvht2004110029.kiemtragiuaky;

import java.util.Scanner;

public class AppleTestDrive {
    static Apple apple = new Apple();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            apple.menu();
            System.out.println("Sự lựa chọn của bạn ");
            int n = scanner.nextInt();
            switch(n){
              case 0:
              break;  
              case 1:
              apple.themtao();
              break;
              case 2:
              apple.tim();
              break;
              case 3:
              apple.inthongtin();

            }
        }while(true);
    }
    
}
