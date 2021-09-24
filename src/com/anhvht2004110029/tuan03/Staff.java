package com.anhvht2004110029.tuan03;


public class Staff {

    String tennhanvien;
    String diachi;
    String bophanlmviec;
    String ngaysinh;
    String luong;
    String chucvu;

    Staff(){
    }

    Staff(String tnv, String dc, String bplv, String ns, String l){
        tennhanvien = tnv;
        diachi = dc;
        bophanlmviec = bplv;
        ngaysinh = ns;
        luong = l;
    }

    Staff(String tnv, String dc, String bplv, String ns, String l, String cv){
        tennhanvien = tnv;
        diachi = dc;
        bophanlmviec = bplv;
        ngaysinh = ns;
        luong = l;
        chucvu =cv;
    }

    void inTTinnhanvien(){
        System.out.println("Tên nhân viên: " + tennhanvien);
        System.out.println("Địa chỉ: " + diachi);
        System.out.println("Bộ phận làm việc: " + bophanlmviec);
        System.out.println("Ngày sinh: " + ngaysinh);
        System.out.println("Lương tháng: VND" + luong);
        System.out.println("Chức vụ: " + chucvu);
    }

    
}
