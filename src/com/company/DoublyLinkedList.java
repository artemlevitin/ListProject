package com.company;

public class DoublyLinkedList{
    private Node node = null;
    private int lenght=0;


    public Node getNode() {
        return node;
    }

    private void addNode(int x) {
        if(this.node==null) {
            node=new Node();
            node.setX(x);
            node.setPrev(null);
            node.setNext(null);
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
    private int x;
    private Node Prev;
    private Node Next;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Node getPrev() {
        return Prev;
    }

    public void setPrev(Node prev) {
        Prev = prev;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node next) {
        Next = next;
    }
}
