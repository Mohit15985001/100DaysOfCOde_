package com.company.Day3;

public class LinkedList {

//    private final int value;
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void insertFist(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if(tail == null){
            tail=head;
        }
        size+=1;
//        System.out.println();
    }
    public void insertLast(int val){
        if(tail==null){
            insertFist(val);
            return;
        }
        Node temp = new Node(val);
        tail.next=temp;
        tail=temp;
        size++;
    }
//    public void insert(int val,int idx){
//        if(idx==size){
//            insertLast(val);
//            return;
//        }
//        if(idx== 0){
//            insertFist(val);
//            return;
//        }
//        Node temp = head;
//
//        for (int i = 1; i < idx; i++) {
//            temp=temp.next;
//        }
//        Node node = new Node(val,temp.next);
//        temp.next=node;
//        size++;
//
//
//    }
    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public void insert(int val, int index) {
        if (index == 0) {
            insertFist(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }
    public void deleteFirst(){
        if(size==0){
            return;
        }
        head = head.next;
        size--;

    }
    public void deleteLast(){
        Node temp=head;
        if(size==0){
            return;
        }
        for (int i = 1; i < size-1; i++) {
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
        size--;

    }
    public int delete(int index){
        Node prev =get(index-1);
        int val = prev.next.value;
        prev.next=prev.next.next;
        size--;
        return val;
    }

    public Node get(int index){
        Node node=head;
        for (int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }


}
