package com.anhvht2004110029.tuan09;

public class Linkedlist {
    private int size;
    private NodeApple head, tail;
    Apple apple = new Apple();
    public Linkedlist(){
        Apple.autoId = 1;
        this.size = 0;
        this.head = null;
        this.tail = null;
    }
    public int size()
    {
        return this.size;
    }
    public void insertAt(NodeApple nApple, int position)
    {
        if(position < 1)
        { 
            nApple.next = this.head;
            this.head = nApple;
            
            if(this.head == null)
            {
                this.tail = nApple;
            }
            this.size++;
            return;
        }
        //thêm cuối
        if(position >= this.size)
        {
            if(this.tail != null)
            {
                this.tail.next = nApple;
            }
            this.tail = nApple;
            if(this.head == null)
            {
                this.head = nApple;
            }
            this.size++;
            return;
        }
    }
    public void showData()
    {
        NodeApple nApple = head;
        while(nApple != null)
        {
            nApple.displayData();
            nApple = nApple.next;
        }
    }
}
