package DS07_DSA.Trees;

public class Implementation {
    public static class Node{
        int val;   // initial val 0
        Node left;  // initial pointer is at null
        Node right;  // initial pointer is at null

        public Node(int val) {
            this.val = val;
        }
    }
    public static void display(Node root){   // it receive root node
        if(root == null) return;
        System.out.print(root.val + " -> ");
        if(root.left!=null) System.out.print(root.left.val + "  ");
        if(root.right!=null) System.out.println(root.right.val + " , ");
        System.out.println();
        display(root.left);   // next here, child ele considered as root
        display(root.right);

    }
    public static void main(String[] args) {
        Node root = new Node(2);

        Node a = new Node(4);
        Node b = new Node(10);

        root.left = a;
        root.right = b;

        Node c = new Node(6);
        Node d = new Node(5);
        a.left = c;
        a.right = d;

        Node e = new Node(11);
        b.right = e;

        display(root);
    }
}
