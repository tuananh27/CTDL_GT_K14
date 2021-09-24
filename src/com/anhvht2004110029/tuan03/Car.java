package com.anhvht2004110029.tuan03;

public class Car {

    String tenchuxe;
    String hangsanxuat;
    String dong;
    String giayphep;
    String dungtichxang;
    String dongco;
    String namsanxuat;

    Car(){

    }

    Car(String tcx, String hsx, String d, String gp, String dtx){
        tenchuxe = tcx;
        hangsanxuat = hsx;
        dong = d;
        giayphep = gp;
        dungtichxang = dtx;
    }

    Car(String tcx, String hsx, String d, String gp, String dtx, String dc, String nsx){
        tenchuxe = tcx;
        hangsanxuat = hsx;
        dong = d;
        giayphep = gp;
        dungtichxang = dtx;
        dongco = dc;
        namsanxuat = nsx;
    }

    void inXe(){
        System.out.println("Tên chủ xe: " + tenchuxe);
        System.out.println("Hãng sản xuất: " + hangsanxuat);
        System.out.println("Dòng xe: " + dong);
        System.out.println("Giấy phép: " + giayphep);
        System.out.println("Dung tích bình xăng: " + dungtichxang);
        System.out.println("Động cơ: " + dongco);
        System.out.println("Năm sản xuất: " + namsanxuat);
        
    }
    
}
