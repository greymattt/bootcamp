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

class LinkedList {
    void insert(Node head, int x) {
        Node newnode = new Node(x);
        newnode.next = head.next;
        head.next = newnode;
    }
    
    void display(Node head) {
        Node tmp = head.next;
        while (tmp.next != null) {
            System.out.printf("%d ", tmp.data);
            tmp = tmp.next;
        }
        System.out.printf("%d", tmp.data);
    }
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = new Node();
        LinkedList l = new LinkedList();
        for (int i=0; i<n; i++)
            l.insert(head, sc.nextInt());
        l.display(head);
    }
}