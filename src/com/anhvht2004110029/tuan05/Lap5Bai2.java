package com.anhvht2004110029.tuan05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Lap5Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrString = new ArrayList<String>();
        ArrayList<String> arrString2 = new ArrayList<String>();
        ArrayList<String> arrString3 = new ArrayList<String>();
        ArrayList<String> arrString4 = new ArrayList<String>();
        arrString = nhapMang();
        Xuatmang(arrString);

        arrString2 = sapxepMang(arrString);
        Xuatmang(arrString2);

        arrString3 = sapxepMangTG(arrString);
        Xuatmang(arrString3);

        System.out.print("Họ tên bạn muốn xóa: ");
        String hoTen = scanner.nextLine();
        arrString4 = xoamang(arrString, hoTen);
        Xuatmang(arrString4);
        int chon;
        do {
            System.out.println("|-----------------------Menu------------------|");
            System.out.println("|1. Nhập danh sách                            |");
            System.out.println("|2. Hiện thị danh sách                        |");
            System.out.println("|3. Sắp xếp danh sách                         |");
            System.out.println("|4. Hiện thị ngẫu nhiên danh sách             |");
            System.out.println("|5. Tìm kiếm và xóa họ tên trong danh sách    |");
            System.out.println("|6. Thoát chương trình                        |");
            System.out.println("|---------------------------------------------|");
            int choice  = scanner.nextInt();
            switch(choice)  {
                case 1:
                nhapMang();
                break;
                case 2:
                Xuatmang(arrString);
                break;
                case 3:
                sapxepMang(arrString);
                break;
                case 4:
                sapxepMangTG(arrString);
                break;
                case 5:
                xoamang(arrString, hoTen);
                break;
                case 6:
                System.exit(0);
                break;
            }
            System.out.println(" Nhập vào sự lựa chọn");
            chon = scanner.nextInt();
        } while (chon == 1);
    
        
    }
    

    public static ArrayList<String> nhapMang(){
        ArrayList<String> arrString = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Nhập tên: ");
            String x = scanner.nextLine();
            arrString.add(x);
            System.out.print("Nhập thêm (Y / N) ? ");
            if(scanner.nextLine().equals("N")){
                break;
            }
        }
        return arrString;
    }
    public static void Xuatmang(ArrayList<String> arrString){
        System.out.println("Danh sách họ tên: ");
        for (String d : arrString) {
            System.out.print(d +"\n");   
        }
    }

    public static ArrayList<String> sapxepMang(ArrayList<String> arrString){
        Collections.shuffle(arrString);
        return arrString;
    }

    public static ArrayList<String> sapxepMangTG(ArrayList<String> arrString){
        Collections.sort(arrString);
        Collections.reverse(arrString);
        return arrString;
    }

    public static ArrayList<String> xoamang(ArrayList<String> arrString, String tencanxoa){
        arrString.remove(tencanxoa);
        return arrString;
    }
    


}


