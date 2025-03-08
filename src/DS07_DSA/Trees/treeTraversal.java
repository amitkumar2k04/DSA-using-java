package DS07_DSA.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class treeTraversal {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static void preOrder(Node root){
        // preOrder -> root, left, right
        if(root == null) return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void InOrder(Node root){
        // InOrder -> left, root, right
        if(root == null) return;
        InOrder(root.left);
        System.out.print(root.val + " ");
        InOrder(root.right);
    }
    public static void postOrder(Node root){
        // postOrder -> left, right, root,
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    // Printing elements of nth level
    public static void nthLevel(Node root, int n){   // n -> represents no of levels
        if(root == null) return;
        if(n == 1) {
            System.out.print(root.val + " ");
            return;
        }
        nthLevel(root.left, n -1);
        nthLevel(root.right, n -1);
    }
    // Find Height of the binary tree
    public static int treeHeight(Node root){
        if(root == null || root.left == null && root.right == null) return 0;
        return 1 + Math.max(treeHeight(root.left), treeHeight(root.right));
    }

    // By using queue (Doing LOT) -> By applying BFS
    public static void bfs(Node root){     // Its also by iterative way -> no recursion uses here
        Queue<Node> q = new LinkedList<>();
        if(root != null) q.add(root);
        while (q.size()>0){
            Node temp = q.peek();
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
            System.out.print(temp.val + " ");
            q.remove();
        }
    }


    public static void main(String[] args) {
        Node root = new Node(1);

        Node a = new Node(2);
        Node b = new Node(3);

        root.left = a;
        root.right = b;

        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;

        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;

        //preOrder(root);
        //InOrder(root);
        //postOrder(root);


        //nthLevel(root, 3); // printing specific level elements
        // printing all levels
//        int Level = treeHeight(root) + 1;
//        for(int i = 1; i<=Level; i++){
//            nthLevel(root, i);
//            System.out.println();
//        }

        bfs(root);

    }
}
