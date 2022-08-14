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
            // else if(node.right != null) {
            //     System.out.print(node.data + " ");
            //     printLeft(node.right);
            // }
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


class BoundaryTraversal {
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
