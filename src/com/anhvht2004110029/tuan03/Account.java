package com.anhvht2004110029.tuan03;

public class Account {

    String tenchutaikhoan;
    String sotaikhoan;
    String tiencotrongtk;
    String sodu;
    String capbac;
    String loaithe;

    Account(){

    }

    Account(String tctk, String stk, String sd, String cb){
        tenchutaikhoan = tctk;
        sotaikhoan = stk;
        sodu = sd;
        capbac = cb;
    }

    Account(String tctk, String stk, String sd, String cb, String lt){
        tenchutaikhoan = tctk;
        sotaikhoan = stk;
        sodu = sd;
        capbac = cb;
        loaithe = lt;

    }

    void intThenganhang(){
        System.out.println("Tên chủ tài khoản: " + tenchutaikhoan);
        System.out.println("Số tài khoản: " + sotaikhoan);
        System.out.println("Tiền có trong tài khoảng: VND" + tiencotrongtk);
        System.out.println("Số dư: VND" + sodu);
        System.out.println("Cấp bậc: " + capbac);
        System.out.println("Loại thẻ: " + loaithe);

    }


}
