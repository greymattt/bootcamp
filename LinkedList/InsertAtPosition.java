package LinkedList;

import java.util.*;
class Node {
    int data;
    Node next;

    Node() {
        next = null;
    }

    Node(int x) {
        data = x;
        next = null;
    }
}

class InsertAtPosition {
    void insert(Node head, int x) {
        Node newnode = new Node(x);
        Node tmp = head;

        while (tmp.next != null)
            tmp = tmp.next;
        tmp.next = newnode;
    }

    void display(Node head) {
        Node tmp = head.next;
        while (tmp.next != null) {
            System.out.printf("%d ", tmp.data);
            tmp = tmp.next;
        }
        System.out.printf("%d ", tmp.data);
    }
    
    void merge(Node head, int x, int position) {
        Node newnode = new Node(x);
        Node  curNode = head;
        int index = 0;
        while(index<position-1) {
            curNode = curNode.next;
            index++;
        }
        newnode.next = curNode.next;
        curNode.next = newnode;
    }

    public static void main(String [] args) {
        Node head = new Node();
        InsertAtPosition l = new InsertAtPosition();
        l.insert(head, 10);
        l.insert(head, 20);
        l.insert(head, 30);
        l.insert(head, 40);
        l.insert(head, 50);
        l.insert(head, 60);
        l.display(head);
        l.merge(head, 80, 3);
        System.out.printf("\n");
        l.display(head);
    }
}
// 3 - 80