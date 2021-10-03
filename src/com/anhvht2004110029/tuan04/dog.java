package com.anhvht2004110029.tuan04;

public class dog {
    
    String name;
    String color;
    int size;

    dog(){

    }

    dog(String n, String c, int s){
        name = n;
        color = c;
        size = s;
    }

    dog(String n, String c){
        name = n;
        color = c;
    }

    void inThongTinDog(){
        System.out.println("Name = "+ name + " " + "Color = "+ color + " " + "Size = "+ size);

    }


}
