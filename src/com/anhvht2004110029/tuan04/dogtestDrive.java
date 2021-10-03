package com.anhvht2004110029.tuan04;

public class dogtestDrive {
    
    public static void main(String[] args) {
        dog[] danhsachdog = new dog[7];

        dog dog0 = new dog("lulu", "đen", 10);

        dog dog1 = new dog("titi", "đỏ");

        danhsachdog[0] = dog0;
        danhsachdog[1] = dog1;

        danhsachdog[0].inThongTinDog();
    }
}
