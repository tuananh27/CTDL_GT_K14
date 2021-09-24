package com.anhvht2004110029.tuan03;

public class Book {

    String nhaxuatban;
    double namxuatban;
    double giaban;
    double soluong;
    String loai;
    double sotrang;

    Book(){

    }

    Book(String nb, double xb, double gb, double sl, String l ){
        nhaxuatban = nb;
        namxuatban = xb;
        giaban = gb;
        soluong = sl;
        loai = l;
    }
    Book(String nb, double xb, double gb, double sl, String l, double st){
        nhaxuatban = nb;
        namxuatban = xb;
        giaban = gb;
        soluong = sl;
        loai = l;
        sotrang = st;
    }


    void inTTinsach(){
        System.out.println("Nhà xuất bản: " + nhaxuatban);
        System.out.println("Năm xuất bản: " + namxuatban);
        System.out.println("Giá bán: " + giaban);
        System.out.println("Số lượng: " + soluong);
        System.out.println("Loại sách:" + loai);
        System.out.println("Số trang: " + sotrang);

    }



        
    
    
    
}
