import java.util.*;
public class Classroom{
    static class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
            
        }
    }
     
    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;
        
        public Info(boolean isBST, int size, int min, int max){
            this.isBST = isBST;
            this.size = size ;
            this.min = min;
            this.max = max;
        }
    } 
    
    public static int maxBST = 0;
    
    public static Info largestBST(Node root){
        if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
        
        if(!leftInfo.isBST || !rightInfo.isBST || root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false, size,min,max);
        }
        
            maxBST = Math.max(maxBST, size);
            return new Info(true,size, min, max);
    }
    
    public static void main(String args[]){
        /*
                      8
                    /   \
                  30     60
                 /  \   /  \
                5   20 45   70
                       /   /  \
                      45  65   80 
                given BST      
            */
            Node root = new Node(50);
            root.left = new Node(30);
            root.left.left = new Node(5);
            root.left.right = new Node(20);
            
            root.right = new Node(60);
            root.right.left = new Node(45);
            root.right.right = new Node(70);
            root.right.right.left = new Node(65);
            root.right.right.right = new Node(80);
            
            /*
                      8
                     / \
                    45   70
                         / \
                        65  80  
                   
                  expected BST : size = 5
            */
            
            largestBST(root);
            System.out.println("largest BST size = " +maxBST);
            
   }
}
