package com.practice.identical;

/**
 * Created by Abhiroop.NandiRay on 2/15/2017.
 */
public class IdenticalLinkedList {

    private static LinkedList.Node node1;
    private static LinkedList.Node node2;
    private static LinkedList.Node node3;
    private static LinkedList.Node node4;
    private static LinkedList.Node node5;
    private static LinkedList.Node node6;

    private static LinkedList.Node node1_1;
    private static LinkedList.Node node1_2;
    private static LinkedList.Node node1_3;
    private static LinkedList.Node node1_4;
    private static LinkedList.Node node1_5;
    private static LinkedList.Node node1_6;

    public static void main(String[] args) {

        LinkedList linkedList1 = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        createFirstLinkedList(linkedList1);
        createSecondLinkedList(linkedList2);

        linkedList1.printList(linkedList1.head, "First Linked List: ");
        linkedList2.printList(linkedList2.head, "Second Linked List: ");

        //boolean isIdentical = linkedList1.isListIdentical(linkedList1.head, linkedList2.head);
        boolean isIdentical = linkedList1.isIdenticalRecursive(linkedList1.head, linkedList2.head);
        System.out.println("The lists are identical ? : " + isIdentical);
    }

    private static void createFirstLinkedList(LinkedList list) {
        list.head = new LinkedList.Node(1);
        node1 = new LinkedList.Node(2);
        node2 = new LinkedList.Node(3);
        node3 = new LinkedList.Node(4);
        node4 = new LinkedList.Node(5);
        node5 = new LinkedList.Node(6);
        node6 = new LinkedList.Node(7);
        list.head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
    }

    private static void createSecondLinkedList(LinkedList list) {
        list.head = new LinkedList.Node(1);
        node1_1 = new LinkedList.Node(2);
        node1_2 = new LinkedList.Node(3);
        node1_3 = new LinkedList.Node(4);
        node1_4 = new LinkedList.Node(5);
        node1_5 = new LinkedList.Node(6);
        node1_6 = new LinkedList.Node(7);
        list.head.next = node1_1;
        node1_1.next = node1_2;
        node1_2.next = node1_3;
        node1_3.next = node1_4;
        node1_4.next = node1_5;
        node1_5.next = node1_6;
    }
}
