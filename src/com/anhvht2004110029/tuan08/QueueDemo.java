package com.anhvht2004110029.tuan08;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();
         queue.add(27);
         queue.add(10);
         queue.add(23);

         System.out.println(queue);

         int phantuDuoclayra = queue.remove();
         System.out.println("Phần tử được lấy ra " +phantuDuoclayra);

         System.out.println("Phần tử còn lại ");
         System.out.println(queue);

         int phantuDuocTham = queue.peek();
         System.out.println("Phần tử được thăm " +phantuDuocTham);

         System.out.println("Phần tử còn lại ");
         System.out.println(queue);
    }
}
