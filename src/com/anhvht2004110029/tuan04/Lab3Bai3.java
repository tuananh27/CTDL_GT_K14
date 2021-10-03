package com.anhvht2004110029.tuan04;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mảng số: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n ; i++){
            System.out.printf("A[%d] = ", i);
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++)        
            System.out.print(a[i]);

        System.out.println();
        int Min = a[0];
        for(int x : a){
            Math.min(Min, x);
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + Min);
        int tong = 0, dem = 0;
        for(int x : a){
            if(x % 3 == 0){
                tong += x;
                dem++;
            }      
        }
        System.out.printf("Trung bình cộng các số chia hết cho 3 = %d", tong/dem);

    }
    
}
