import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node() {
        data = -1;
        left = null;
        right = null;
    }
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Main {
    void insert(Node root, int data) {
        if(root.data == -1) {
            root.data = data;
            return;
        }
        Node newNode = new Node(data);
        Node ref = root;
        while(ref!=null) {
            if(ref.data == data) return;
            else if(data < ref.data) {
                if(ref.left==null) {
                    ref.left = newNode;
                    break;
                }
                ref = ref.left;
            }
            else if(data > ref.data) {
                if(ref.right==null) {
                    ref.right = newNode;
                    break;
                }
                ref = ref.right;
            }
        }
    }

    void preOrder(Node ref) {
        if(ref!=null) {
            System.out.print(ref.data+"  ");
            preOrder(ref.left);
            preOrder(ref.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = new Node();
        Main mm = new Main();
        int i, n = sc.nextInt();
        for(i=0; i<n; ++i) mm.insert(root, sc.nextInt());

        System.out.print("PREORDER = ");
        mm.preOrder(root);

        sc.close();
    }
}
