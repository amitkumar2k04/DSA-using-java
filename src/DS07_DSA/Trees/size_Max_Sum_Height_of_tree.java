package DS07_DSA.Trees;

public class size_Max_Sum_Height_of_tree {
    public static class Node{
        int val;   // initial val 0
        Node left;  // initial pointer is at null
        Node right;  // initial pointer is at null

        public Node(int val) {
            this.val = val;
        }
    }
    // Find Size of the Tree
    public static int size(Node root){
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    // Find Node with Maximum Value
    public static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a, Math.max(b, c));
    }
    // Find Sum of Tree Node
    public static int sum(Node root){
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    // Find Height of the binary tree
    public static int treeHeight(Node root){
        if(root.left == null && root.right == null) return 0;
        return 1 + Math.max(treeHeight(root.left), treeHeight(root.right));
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
        Node f = new Node(25);
        b.left = e;
        b.right = f;


        System.out.println( "The size of the Binary tree is: "+size(root));
        System.out.println( "The maximum valued Node in Tree is: "+max(root));
        System.out.println( "The sum of the tree Node is: "+ sum(root));
        System.out.println( "The height of tree is: "+ treeHeight(root));
    }
}
