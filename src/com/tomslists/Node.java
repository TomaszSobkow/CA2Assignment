package com.tomslists;

public class Node <T> {

    Node next;
    private T data;


    public Node(T data){
        this.data = data;
        next = null;
    }

    public T getData() { return data; }
    public void setData(T data) { this.data = data; }

    public Node getNext() { return next; }
    public void setNext(Node next) { this.next = next; }
}
