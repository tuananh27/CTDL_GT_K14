package com.anhvht2004110029.tuan03;


public class CartestDrive {
    public static void main(String[] args) {
        
        Car car;
        car = new Car("Nguyễn Văn A", "BMW", "Supercar", "B2", "14.2l");
        
        car.inXe();

        System.out.println("---------------");

        car = new Car("Nguyễn Văn B", "Rolls-Royce", "Classic car", "B2", "15l", "V8","1959");

        car.inXe();

    }
    
}
