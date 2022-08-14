package LinkedList;

class ReverseLinkedList {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int x) {
            data = x;
            next = null;
        }
    }
    void reverse() {
        Node current = head;
        Node prev = null;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    void push(int x) {
        Node newnode = new Node(x);
        newnode.next = head;
        head = newnode;
    }

    void del() {
        Node curNode = head;
        Node maxnode = head;
        Node temp;

        while (curNode != null && curNode.next != null) {
            if (curNode.next.data < maxnode.data) {
                temp = curNode.next;
                curNode.next = temp.next;
                temp = null;
            }
            else {
                curNode = curNode.next;
                maxnode = curNode;
            }
        }
    }

    void display() {
        Node curNode = head;
        while (curNode != null) {
            System.out.printf("%d ", curNode.data);
            curNode = curNode.next;
        }
        System.out.println();
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        ReverseLinkedList list = new ReverseLinkedList();
        int n = sc.nextInt();
        for (int i=0; i<n; i++)
            list.push(sc.nextInt());

        list.display();
        list.reverse();
        list.del();
        list.reverse();
        list.display();
    }
}
