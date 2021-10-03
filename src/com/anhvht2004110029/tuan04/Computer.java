package com.anhvht2004110029.tuan04;

public class Computer {
    String nhasanxuat;
    String namsanxuat;
    String hedieuhanh;
    String ram;
    String CPU;
    String gia;
    String nambaohanh;
    
    Computer(){}

    Computer(String nsx, String nx, String hdh, String r, String C, String g, String nbh ){
        nhasanxuat = nsx;
        namsanxuat = nx;
        hedieuhanh = hdh;
        ram = r;
        CPU = C;
        gia = g;
        nambaohanh = nbh;
    }

    void intThongtinPC(){
        System.out.println("Nhà sản xuất: "+nhasanxuat + " Năm sản xuất: "+namsanxuat + " Hệ điều hành: "+hedieuhanh + " Ram: "+ram + " CPU: "+CPU + " Giá: "+gia + " Năm bảo hảnh: "+nambaohanh);
    }
}
