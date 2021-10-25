package com.anhvht2004110029.kiemtragiuaky;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.anhvht2004110029.tuan07.Node;

public class Apple {
    String mausac, ma;
    float khoiluong;
    Scanner scanner = new Scanner(System.in);
    public Node next;
    static List<Apple> apple = new ArrayList<>();

    public Apple(){}

    public Apple(String ms, String m, float k){
        mausac = m;
        ma = m;
        khoiluong = k;

    }
    
    public void menu(){
        System.out.println("---------------MENU------------------");
        System.out.println("|1 Thêm táo vào kho                 |");
        System.out.println("|2 Tìm táo theo màu                 |");
        System.out.println("|3 In danh sách                     |");
        System.out.println("|4 Kết thúc                         |");
        System.out.println("-------------------------------------");
       
    }
    public void inthongtin(){
        System.out.println("Màu sắc quả táo: " +mausac);
        System.out.println("Mã quả táo:" +ma);
        System.out.println("Khối lượng quả táo: " +khoiluong);
    }
    public void inramanhinh(){
        System.out.printf("%-20S %-20S %-20S\n","id applle", "weight apple", "color apple");
    }

    public void nhapthongtin(){
        System.out.println("Nhập mã táo: ");
        ma = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Khối lượng quả táo: ");
        khoiluong = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Màu sắc: ");
        mausac = scanner.nextLine();
        scanner.nextLine();

    }

    public void xuatthongtin(){

    }

    public void themtao(){
        System.out.println("Tổng số táo");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            Apple apple1 = new Apple();
            nhapthongtin();
            apple.add(apple1);
        }
    }
    public void tim(){
        System.out.println("Tìm màu cảu táo: ");
        String ten = scanner.nextLine();
        for (Apple apple2 : apple) {
            if(ten.equals(apple2.mausac)){
                apple2.inramanhinh();
            }
            
        }
    }

    
}
