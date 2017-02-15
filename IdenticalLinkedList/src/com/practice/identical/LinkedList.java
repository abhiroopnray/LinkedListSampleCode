package com.practice.identical;

/**
 * Created by Abhiroop.NandiRay on 2/15/2017.
 */
public class LinkedList {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public void printList(Node n, String message){

        while(n != null){
            System.out.println(message + n.data);
            n = n.next;
        }
    }

    public boolean isListIdentical(Node a, Node b){

        while(a != null && b != null){
            if(a.data != b.data){
                return false;
            }

            a = a.next;
            b = b.next;
        }

        return ((a == null) && (b == null));
    }

    public boolean isIdenticalRecursive(Node a, Node b){
        if(a == null && b == null){
            return true;
        }

        if(a.data != b.data)
            return false;
        return isIdenticalRecursive(a.next, b.next);
    }
}
