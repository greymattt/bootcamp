// package Trees.BST;

// public class Tree {
//     class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int x) {
//             data = x;
//             left = null;
//             right = null;
//         }
//     }

//     Node insert(int []arr,int i) {
//         Node root = null;
//         // Base case for recursion
//         if (i < arr.length) {
//             root = new Node(arr[i]);
//             // insert left child
//             root.left = insert(arr, 2 * i + 1);
//             // insert right child
//             root.right = insert(arr, 2 * i + 2);
//         }
//         return root;
//     }

//     void inorder(Node root) {
//         if (root != null) {
//             inorder(root.left);
//             System.out.printf("%d ", root.data);
//             inorder(root.right);
//         }
//     }

//     void preOrder(Node root) {
//         if(root != null) {
//             System.out.printf("%d ", root.data);
//             preOrder(root.left);
//             preOrder(root.right);
//         }
//     }

//     void postOrder(Node root) {
//         if(root != null) {
//             postOrder(root.left);
//             postOrder(root.right);
//             System.out.printf("%d ", root.data);
//         }
//     }
// }



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

public class Tree {
Node root=null;

Node insert(int arr[], int i) {
  	Node root = null;
    if (i < arr.length) {
        root = new Node(arr[i]);
        // insert left child
        root.left = insert(arr, 2 * i + 1);
        // insert right child
        root.right = insert(arr, 2 * i + 2);
    }
    return root;
  }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    void postOrder(Node root) {
        if(root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.printf("%d ", root.data);
        }
    }

    void preOrder(Node root) {
        if(root != null) {
            System.out.printf("%d ", root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }


	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4};
	    Tree t2 = new Tree();
        t2.root = t2.insert(arr, 0);
        t2.inOrder(t2.root);
        System.out.printf("\n");
        t2.inOrder(t2.root);
	}

}
