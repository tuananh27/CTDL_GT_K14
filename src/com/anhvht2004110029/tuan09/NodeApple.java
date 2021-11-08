package com.anhvht2004110029.tuan09;

public class NodeApple {
    public Apple apple;
    public NodeApple next;
     public NodeApple(Apple apple)
     {
         this.apple = apple;
         this.next = null;
     }
     public void displayData()
     {
         apple.displayApple();
     }
}
