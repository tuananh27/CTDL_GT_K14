package com.anhvht2004110029.tuan07;


public class MyLinkedList {
    Node head = null;
    Node tail = null;

    public MyLinkedList(){}

    void add(int data){
        Node newNode = new Node(data);

        if(head == null){// thêm 1 nút vào danh sách rỗng
            head = newNode;
            tail = newNode;
        }else{// dsach k rỗng // thêm vào cuối dsach
            tail.next = newNode;
            tail = newNode;

        }

    }

    void remve(){

    }

    void print(){
        Node cur = head;

        if(head == null){
            System.out.println("Danh sách rỗng!!!");
            return;
        }

        System.out.println("Các nút có trong danh sách");
        while(cur != null){
            System.out.println(cur.data);
            cur = cur.next;
            
        }

    }

    void find(){

    }

    
}
