package Test;


class LinkedList {
    Node head;
    class Node {
        int data;
        Node next;

         Node (int x) {
             data = x;
             next = null;
         }
    }

    void insert(int x) {
        Node newnode = new Node(x);
        newnode.next = head;
        head = newnode;
    }

    void display() {
        Node curNode = head;
        while (curNode != null) {
            System.out.printf("%d ", curNode.data);
            curNode = curNode.next;
        }
    }

    void displayMod(int x) {
        Node curNode = head;
        while (curNode != null) {
            
        }
    }
}

class sortLinkedListWithNumber {
    public static void main(String [] args) {
        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.display();
    }
}
