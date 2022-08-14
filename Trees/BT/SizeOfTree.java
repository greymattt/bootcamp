import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BT {
    Node root = null;
    Node insert(int arr[], int i) {
        Node root = null;
        if (i<arr.length) {
            root = new Node(arr[i]);
            root.left = insert(arr, 2*i+1);
            root.right = insert(arr, 2*i+2);
        }
        return root;
    }

    int sum(Node root) {
        if (root==null)
            return 0;
        return 1+sum(root.left)+sum(root.right);
    }
}

class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        BT bin = new BT();
        String s[] = sc.nextLine().split(" ");
        int arr[] = new int[s.length];
        for (int i=0; i<s.length; i++)
            arr[i] = Integer.parseInt(s[i]);
        bin.root = bin.insert(arr, 0);
        System.out.println(bin.sum(bin.root));
    }
}
