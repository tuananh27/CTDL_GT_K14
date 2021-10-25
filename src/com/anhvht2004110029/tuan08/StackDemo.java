package com.anhvht2004110029.tuan08;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        //thêm 1 phần tử
        stack.push("Welcom");
        stack.push("To");
        stack.push("Data");

        System.out.println(stack);

        //Lấy ra 1 phần tử
        String poped = stack.pop();

        System.out.println("Đã lấy ra: " +poped);
        System.out.println("Phần tử còn lại: " +stack);
        System.out.println(stack);

        //Thăm nút đỉnh //Không có xóa
        String phantuDuocTham = stack.peek();
        System.out.println("Thăm phần tử đỉnh: " +phantuDuocTham);
        System.out.println(stack);
    }
    
}
