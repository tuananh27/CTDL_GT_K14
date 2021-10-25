package com.anhvht2004110029.tuan07;

public class MyLinkedListTestDrive {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(4);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(8);
        myLinkedList.push(10);
        myLinkedList.intsertAfter(myLinkedList.head.next, 7);
        myLinkedList.searchNode(0);
        myLinkedList.removeFristNode(10);
        myLinkedList.removeLastNode(8);

    

        myLinkedList.print();
    }
    
}
