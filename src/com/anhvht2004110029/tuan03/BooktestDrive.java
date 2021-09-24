package com.anhvht2004110029.tuan03;

public class BooktestDrive {
    public static void main(String[] args) {
        Book book;
        //book = new Book();
        book = new Book("Nguyễn", 2019, 150, 1000, "Tiểu thuyết");
        
        book.inTTinsach();

        System.out.println("------------------");

        book = new Book("Trần", 2020, 200, 2000, "Tình cảm", 1500);
        
        book.inTTinsach();
      


    }
    
}
