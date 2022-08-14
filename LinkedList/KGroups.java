import java.util.*;

public class KGroups {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    Node reverse(Node head, int k) {
        Node curNode = head;
        Node next = null;
        Node prev = null;
        int index = 0;

        while(index<k && curNode != null) {
            next = curNode.next;
            curNode.next = prev;
            prev = curNode;
            curNode = next;
            index++;
        }

        if (next != null)
            head.next = reverse(next, k);
        return prev;
    }

    void insert(int x) {
        Node newnode = new Node(x);
        newnode.next = head;
        head = newnode;
    }

    void display() {
        Node curNode = head;
        while(curNode != null) {
            System.out.printf("%d ", curNode.data);
            curNode = curNode.next;
        }
        System.out.printf("\n");
    }


    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        KGroups l = new KGroups();
        // int n = sc.nextInt();
        // for (int i=0; i<n; i++)
        //     l.insert(sc.nextInt());
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.insert(50);
        l.display();
        l.reverse(l.head, 3);
        System.out.printf("\n");
        l.display();
        sc.close();

    }
}