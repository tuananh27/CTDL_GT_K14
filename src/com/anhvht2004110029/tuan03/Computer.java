package com.anhvht2004110029.tuan03;

public class Computer {

    String nhasanxuat;
    String namsanxuat;
    String hedieuhanh;
    String ram;
    String CPU;
    String gia;
    String nambaohanh;
    String dohoa;
    String led;

    Computer(){

    }

    Computer(String nsx, String nx, String hdh, String r, String CU, String g, String nbh){
        nhasanxuat = nsx;
        namsanxuat = nx;
        hedieuhanh = hdh;
        ram = r;
        CPU = CU;
        gia = g;
        nambaohanh = nbh;
    }

    Computer(String nsx, String nx, String hdh, String r, String CU, String g, String nbh, String dh, String l){
        nhasanxuat = nsx;
        namsanxuat = nx;
        hedieuhanh = hdh;
        ram = r;
        CPU = CU;
        gia = g;
        nambaohanh = nbh;
        dohoa = dh;
        led = l;
    }
    



    void inTtinmaytinh(){
        System.out.println("Nhà sản xuất: " + nhasanxuat);
        System.out.println("Năm sản xuất: " + namsanxuat);
        System.out.println("Hệ điều hành: " + hedieuhanh);
        System.out.println("Ram: " + ram);
        System.out.println("CPU: " + CPU);
        System.out.println("Giá: " + gia);
        System.out.println("Năm bảo hành: " + nambaohanh);
        System.out.println("Car đồ họa: " + dohoa);
        System.out.println("Đèn led: " + led);

    }  
}
