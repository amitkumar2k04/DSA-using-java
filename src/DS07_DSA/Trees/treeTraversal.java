package DS07_DSA.Trees;

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

        preOrder(root);
        InOrder(root);
        postOrder(root);
    }
}
