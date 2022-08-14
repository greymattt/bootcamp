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

class BST {
    Node root = null;
    Node insert(int arr[], int i) {
        Node root=null;
        if (i<arr.length) {
            root = new Node(arr[i]);
            root.left = insert(arr, 2*i+1);
            root.right = insert(arr, 2*i+2);
        }
        return root;
    }

    void inOrder(Node root) {
        if (root!=null) {
            inOrder(root.left);
            System.out.printf("%d ", root.data);
            inOrder(root.right);
        }
    }

    void preOrder(Node root) {
        if (root!=null) {
            System.out.printf("%d ", root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void postOrder(Node root) {
        if (root!=null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.printf("%d ", root.data);
        }
    }
}

class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        int arr[] = new int[s.length];
        BST bin = new BST();
        for (int i=0; i<s.length; i++)
            arr[i] = Integer.parseInt(s[i]);
        bin.root = bin.insert(arr, 0);
        System.out.printf("Preorder traversal:\n");
        bin.preOrder(bin.root);
        System.out.printf("\nInorder traversal:\n");
        bin.inOrder(bin.root);
        System.out.printf("\nPostorder traversal:\n");
        bin.postOrder(bin.root);
    }
}
