package BinaryTree;
 class Node{
      int val;
      Node left;
       Node right;
        Node root;
         Node(int val) {
             this.val = val;
         }
 }

public class ImplementationOfTree {
    public static void main(String args[]){
        Node a = new Node(1);
       Node b = new Node(43);
        Node c = new Node(4);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(6);
         Node g = new  Node(9);
        a.left = b;a.right = c;
        b.left = d;b.right = e;
        c.left = f; c.right = g;
        display(a);
        System.out.println();
//        System.out.println("Your total length of  the  Tree is : "+size(a));
//        System.out.println("Your total Sum of  the  Tree is : "+Sum(a));
//        System.out.println("Your total  product  of  the  Tree  Node  is : "+Product(a));
//        System.out.println("Maximum elements is that :"+Maximum(a));
//        System.out.println("Maximum elements is that :"+minimum(a));
        System.out.println("levels of  the  tree is  : "+levels(a));
    }

    private static int  levels(Node root) {
         if( root == null) return 0;
         int level =    1+ Math.max(levels(root.left),levels(root.right));
          return level;
    }

    private static  int   minimum(Node root) {
         if( root == null){
              return  Integer.MAX_VALUE;
         }
         int minimum = Math.min(root.val,Math.min(root.right.val, root.left.val));
          return  minimum;
    }

    private static int  Maximum(Node root) {
         if(root == null){
               return  Integer.MIN_VALUE;
         }
          int max =  Math.max(root.val,Math.max(root.left.val,root.right.val));
          return  max;
    }


    private static int Product(Node root) {
         if(root == null) return 1;
           int product = root.val* Product(root.left)*Product(root.right);
            return product;
    }

    private static int  Sum(Node root) {
            if(  root == null) return 0;
            int ans  = root.val+Sum(root.left)+Sum(root.right);
             return  ans;
    }

    private static int  size(Node root) {
        if(root == null) return 0;
          int leftSizeNode = size(root.left);
           int rightSizeNode = size(root.right);
            return  1+leftSizeNode+rightSizeNode;
    }

    private static void display(Node root){
        if( root == null){
            return;
        }
        System.out.print(root.val+"  ");
        display(root.left);
        display(root.right);
    }

}
