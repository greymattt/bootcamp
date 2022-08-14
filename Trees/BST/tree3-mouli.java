import java.util.Scanner;
class Node{
    int num;
    Node left,right;
    Node() {
        left=null;
        right=null;
        num=-1;
    }
    Node(int num) {
        this.num=num;
        left=null;
        right=null;
    }
}

class Tree{
    public void insert(int num,Node root){
        if(root.num==-1)
            root.num=num;
        else{
            Node node = new Node(num);
            while(true){
                if(root.num<num){
                    if(root.right==null)
                        root.right=node;break;
                    root=root.right;
                }
                else if(root.num>num){
                    if(root.left==null){root.left=node;break;}
                    root=root.left;
                }
                else{break;}
            }
        }
    }
    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.num+"  ");
            inorder(root.right);
        }
    }
}
class demo{
    public static void main(String args[]){
        Scanner ip = new Scanner(System.in);
        int len = ip.nextInt();
        Node root = new Node();
        Tree tree = new Tree();
        for(int i=0;i<len;i++)
            tree.insert(ip.nextInt(),root);
        System.out.print("INORDER = ");
        tree.inorder(root);
        ip.close();
    }
}
