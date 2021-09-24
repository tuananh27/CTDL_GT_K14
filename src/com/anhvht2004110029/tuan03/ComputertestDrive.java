package com.anhvht2004110029.tuan03;

public class ComputertestDrive {
    public static void main(String[] args) {
        Computer computer;
        
        computer = new Computer("Dell", "2020", "Window", "16GB", "None", "40000000", "1 năm");

        computer.inTtinmaytinh();

        System.out.println("--------------------");
        
        computer = new Computer("Acer", "2020", "Window", "16GB", "None", "4000000", "1 năm", "RTX 3060", "Led 7 màu");

        computer.inTtinmaytinh();

    }
    
}
