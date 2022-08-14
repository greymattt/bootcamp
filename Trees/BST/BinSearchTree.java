package Trees.BST;

class Node {
   int data;
   Node left, right;
   Node(int data) {
       this.data = data;
       this.left = null;
       this.right = null;
   }
}

class test {
        Node insert(Node root,int x){
            if(root==null){
                root=new Node(x);
                return root;
            }
            else if(x<root.data){
                root.left=insert(root.left,x);
            }
            else if(x>root.data){
                root.right=insert(root.right,x);
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

        void postOrder(Node root) {
            if(root!=null) {
                postOrder(root.left);
                postOrder(root.right);
                System.out.printf("%d ", root.data);
            }
        }

        void printLeaves(Node node) {
            if (node == null)
                return;
            printLeaves(node.left);
            if (node.left == null && node.right == null)
                System.out.print(node.data + " ");
            printLeaves(node.right);
        }

        void printLeft(Node node) {
            if (node == null)
                return;
            if (node.left != null) {
                System.out.print(node.data + " ");
                printLeft(node.left);
            }
            else if(node.right != null) {
                System.out.print(node.data + " ");
                printLeft(node.right);
            }
        }

        void printRight(Node node) {
            if (node == null)
                return;
            if (node.right != null) {
                System.out.print(node.data + " ");
                printRight(node.right);
            }
        }

        void printBoundary(Node node) {
            if (node == null) {
                return;
            }
            System.out.printf(node.data + " ");
            printLeft(node.left);
            printLeaves(node.left);
            printLeaves(node.right);
            printRight(node.right);
        }
}


class BinSearchTree {
    public static void main(String [] args) {
        test bin = new test();
        int arr[] = {20,8,4,12,10,14,22,25};
        Node root = null;
        for (int i: arr)
            root = bin.insert(root, i);
        bin.printBoundary(root);
        // bin.postOrder(root);
    }
}



// You are using Java
// import java.util.*;
// class Node{
//     int data;
//     Node left;
//     Node right;
//     Node(int x){
//         data=x;
//         left=null;
//         right=null;
//     }
// }
// class Tree{
//     Node insert(Node root,int x){
//         if(root==null){
//             root=new Node(x);
//             return root;
//         }
//         else if(x<root.data){
//             root.left=insert(root.left,x);
//         }
//         else if(x>root.data){
//             root.right=insert(root.right,x);
//         }
//         return root;
//     }
//     void inorder(Node root){
//         if(root==null){
//             return ;
//         }
//         else {
//             inorder(root.left);
//             System.out.print(root.data+"  ");
//             inorder(root.right);
//         }
//     }
//
// }
// class Solution{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         Tree t=new Tree();
//         Node root=null;
//         for(int i=0;i<num;i++){
//             root=t.insert(root,sc.nextInt());
//         }
//         System.out.print("INORDER = ");
//         t.inorder(root);
//     }
// }
