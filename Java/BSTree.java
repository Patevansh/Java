package Java;

class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}

class BSTree{
    static int count = 0;

    public static Node insert(Node root, int x) {
        if (root == null)
            return new Node(x);
        if (x < root.data)
            root.left = insert(root.left, x);
        else if (x > root.data)
            root.right = insert(root.right, x);
        return root;
    }
    public static void printl(Node root){
        if(root!=null){
            printl(root.left);
            System.out.println(root.data);
            printl(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        int keys[] = { 20, 8, 22, 4, 12, 10, 14 };
        for (int x : keys)
            root = insert(root, x);
        printl(root);
    }
}