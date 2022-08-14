import java.util.*;

class Node {
    int data;
    Node left, right;
    Node (int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST {
    Node insert(Node root, int x) {
        if(root==null) {
            root = new Node(x);
        }
        else if (x<root.data)
            root.left = insert(root.left, x);
        else if (x>root.data)
            root.right = insert(root.right, x);
        return root;
    }

    int sum(Node root) {
        if (root==null) {
            return 0;
        }
        return root.data+sum(root.left)+sum(root.right);
    }
}

class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        int arr[] = new int[s.length];
        for (int i=0; i<s.length; i++)
            arr[i] = Integer.parseInt(s[i]);
        BST bin = new BST();
        Node root = null;
        for (int i: arr)
            root = bin.insert(root, i);
        System.out.println(bin.sum(root));
    }
}
