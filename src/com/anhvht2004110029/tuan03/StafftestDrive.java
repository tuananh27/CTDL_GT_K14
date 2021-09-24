package com.anhvht2004110029.tuan03;


public class StafftestDrive {
    public static void main(String[] args) {
        Staff staff;

        staff = new Staff("Nguyễn Văn A", "256/6 Quận Bình Tân", "Bộ phận nhân sự", "1/1/1989", "8000000");
        
        staff.inTTinnhanvien();

        System.out.println("-----------------");

        staff = new Staff("Nguyễn Văn B", "Phú Mỹ Hưng", "Tài chính maketing", "2/9/1983", "20000000", "Giám Đốc");

        staff.inTTinnhanvien();



        
    }
    
}
