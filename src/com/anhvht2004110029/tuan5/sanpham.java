package com.anhvht2004110029.tuan5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class sanpham {
    String tenSP;
    double giaSP;
    ArrayList<sanpham> list = new ArrayList<>();

    public sanpham(){
    }

    public sanpham( String t, Double g){
        tenSP = t;
        giaSP = g;
    }

    void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập danh sách sản phẩm: ");
        int i = 1;
        do {
            System.out.printf("Tên sản phẩm %d: " , i);
            String t = scanner.nextLine();
            if(t.isEmpty()){
                break;
            }
            System.out.printf("Giá sản phẩm: ");
            double g =scanner.nextDouble();
            list.add(new sanpham(t, g));
            scanner.nextLine();
            i++;
        
        } while (true);
    }
    
    void hienThi(){
        System.out.println("Danh sách sản phẩm: ");
        for (sanpham sanpham : list) 
            System.out.printf(sanpham +"\n", tenSP, giaSP);
            
    }

    void sapXep(){
        Comparator<sanpham> comp = new Comparator<>(){
            @Override
            public int compare(sanpham o1, sanpham o2) { 
                return Double.compare(o1.giaSP, o2.giaSP);
            }
        };
          Collections.sort(list,comp); 
    }

    void timVaXoa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm cần tìm và xóa: ");
        String ten = sc.nextLine();
        for (sanpham sanpham : list) {
            if(sanpham.equals(ten))
            list.remove(sanpham);
            break;
        }
    }
    void Menu() {
        Scanner scanner = new Scanner(System.in);
    
        do {
            System.out.println("--------------Menu---------------");
            System.out.println("|1.Nhập danh sách               |");
            System.out.println("|2.Hiển thị danh sách           |");
            System.out.println("|3.Sắp xếp giảm dần theo giá    |");
            System.out.println("|4.Tìm và xóa sản phẩm theo tên |");
            System.out.println("|Lựa chọn của bạn là:           |");
            System.out.println("|-------------------------------|");
            int luachon = scanner.nextInt();
            
            switch(luachon){
                case 0:
                break;
                case 1:
                nhapThongTin();
                break;
                case 2:
                hienThi();
                break;
                case 3:
                sapXep();
                break;
                case 4:
                timVaXoa();
                break;
                default:
                System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại");
                 
            }
        } while (true);
    }
    


    
}
