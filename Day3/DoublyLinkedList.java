package com.company.Day3;

public class DoublyLinkedList {
    Node head;
    public void insertFist(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }
    public void display(){
        Node node = head;
        while (node!=null){
            System.out.print(node.value+"->");
            node=node.next;
        }
        System.out.println("end");
    }
    public class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public Node(int value) {
            this.value = value;
        }
    }
}
