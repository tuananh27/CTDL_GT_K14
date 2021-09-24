package tuan02;

import java.util.Date;

public class sinhvien {
     //1.thuộc tính

     String mssv;
     String tenSinhVien;
     int tuoi;
     String queQuan;
     Date ngaySinh;
    
     //2.phương thức
     void inThongTInSV(){
         System.out.println("Mã số sinh viên: " + mssv);
         System.out.println("Tên sinh viên: " + tenSinhVien);
         System.out.println("Tuổi:" + tuoi);
         System.out.println("Quê quán: " + queQuan);
    }
    
}
