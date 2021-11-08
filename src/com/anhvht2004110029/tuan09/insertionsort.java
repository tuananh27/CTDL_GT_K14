package com.anhvht2004110029.tuan09;

import java.util.Arrays;



public class insertionsort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,8,5,7,9,2};
        System.out.println("Mảng chưa chỉnh: " +Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Mảng đã chỉnh: " +Arrays.toString(arr));
    }
    static void insertionSort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
