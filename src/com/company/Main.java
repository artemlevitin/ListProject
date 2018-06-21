package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       DoublyLinkedList dbleLnList = new DoublyLinkedList();
       dbleLnList.add(10);
       dbleLnList.add(8);
       dbleLnList.add(5);
        myShow.length(dbleLnList);

        dbleLnList.delNode(dbleLnList.find(8));
        myShow.length(dbleLnList);

        dbleLnList.remAll();
        myShow.length(dbleLnList);
    }

    static class myShow{

             static void length(DoublyLinkedList dbleLnList) {
            System.out.printf("Length is %d objects \n ", dbleLnList.getLenght());
        }
    }
}
