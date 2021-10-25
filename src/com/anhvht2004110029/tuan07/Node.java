package com.anhvht2004110029.tuan07;

public class Node {
    int data;
    public Node next;

    public Node(){}

    public Node(int d){
        data = d;
        next = null;
    }

    public Node( int d, Node n){
        data = d;
        next = n;   
    }
    
}
