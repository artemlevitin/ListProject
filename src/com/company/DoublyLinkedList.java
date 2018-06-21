package com.company;

public class DoublyLinkedList{
    private Node node = null;
    private int lenght=0;


    public Node getNode() {
        return node;
    }

    void add(int x) {

        if(this.node==null) {
            this.node=new Node();
            this.node.x = x;
        }

        else if(this.node.next == null) {
            Node node = new Node();
            node.x = x;
            node.prev = this.node;
            this.node.next = node;
            this.node = node;
        }

        ++lenght;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
}

class Node {
        int x ;
     Node prev;
     Node next;
     Node(){
         prev=null;
         next=null;
     }
   }
