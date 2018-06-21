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

    public void delNode(Node node){
        if(node==null)
            return;
        else if(node.prev == null){
            this.node = null;
        }
            else if(node.next==null) {
               node.prev.next = null;
               this.node = node.prev;
            }
               else{
                    node.prev.next = node.next;
                    node.next.prev = node.prev;
                }
        --lenght;
    }

    public Node find(int x){

        Node cureNode = this.node;

       for(int i = 0; i < lenght; ++i){
           if(cureNode.x == x)
               return cureNode;
           cureNode = cureNode.prev;
       }

       return null;
    }

    public void remAll(){
       while(this.node !=null){
           delNode(this.node);
       }
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
