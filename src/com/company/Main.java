package com.company;

//import java.awt.*;

public class Main {

    public static void main(String[] args) {

       DoublyLinkedList dbleLnList = new DoublyLinkedList();
       dbleLnList.add(10);
       dbleLnList.add(8);
       dbleLnList.add(5);
       System.out.println(dbleLnList.toString());
       myShow.length(dbleLnList);

      /*  Not implenmented
      for(Node n:dbleLnList){
           System.out.printf("%d \n ", n.x);
       }*/



        dbleLnList.delNode(dbleLnList.find(8));
        System.out.println(dbleLnList.toString());
        myShow.length(dbleLnList);

        dbleLnList.remAll();
        System.out.println(dbleLnList.toString());
        myShow.length(dbleLnList);
    }

    static class myShow{

            static void length(DoublyLinkedList dbleLnList) {
            System.out.printf("Length is %d objects \n ", dbleLnList.getLenght());
        }
    }
}
