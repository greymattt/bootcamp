package LinkedList;

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

public class LinkedList {
    void insert(Node head, int x) {
        Node tmp = head;
        Node newnode = new Node(x);

        while (tmp.next != null)
            tmp = tmp.next;
        tmp.next = newnode;
    }

    void display(Node head) {
        Node tmp = head.next;
        while(tmp.next != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
        System.out.println(tmp.data);
    }

    public static void main(String [] args) {
        // Scanner sc = new Scanner(System.in);
        // int key = sc.nextInt();
        Node head = new Node();
        LinkedList m = new LinkedList();
        // int n = sc.nextInt();
        // for (int i=0; i<n; i++)
            // m.insert(head, sc.nextInt());
        m.insert(head, 10);
        m.insert(head, 20);
        m.insert(head, 30);
        m.display(head);
    }

}
