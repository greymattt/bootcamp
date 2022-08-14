package Trees.BST;
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

class tree1 {
    Node root = null;

    Node insert(int arr[], int i) {
        Node root = null;
        if (i < arr.length) {
            root = new Node(arr[i]);
            root.left = insert(arr, 2 * i + 1);
            root.right = insert(arr, 2 * i + 2);
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

    public static void main(String [] args) {
        int arr[] = {8, 6, 9, 1, 3};
        tree1 t = new tree1();
        t.root = t.insert(arr, 0);
        t.inOrder(t.root);
    }
}
