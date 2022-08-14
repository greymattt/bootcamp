package Test;
class Node {
    int data;
    Node next;

     Node (int x) {
         data = x;
         next = null;
     }
}

class LinkedList {
    Node head;
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
        System.out.printf("%d ", curNode.data);
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
