package com.anhvht2004110029.tuan09;

public class test {
    public static void main(String[] args) {
        int[] arr = new int[]{9,7,6,4,8,5,3,1, 2,5,0};
        int n = arr.length;
        int x = 10;

        System.out.println("Mảng chưa tìm kiếm: ");

        System.out.println();
    }
    int binarySearch(int arr[], int l, int r, int x){
        
        if (r >= l) {
            int mid = l + (r - l) / 2;
        if (arr[mid] > x)
            return binarySearch(arr, l, mid - 1, x);
        return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
    
   
}
