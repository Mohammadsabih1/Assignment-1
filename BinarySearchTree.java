public class BinarySearchTree {
    BstNode root;

    public BinarySearchTree() {

        root = null;
    }

    public BstNode insert(BstNode root, int key) {

        if (root == null) {
            root = new BstNode(key);
            return root;
        }
        if (key < root.key)
            root.left = insert(root.left, key);
        else if (key > root.key)
            root.right = insert(root.right, key);

        return root;
    }
    void  inorder(BstNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
    }
    public void preorder(BstNode root) {
        if (root != null) {
            System.out.println(" " + root.key);
            preorder(root.left);
            preorder(root.right);
        }
    }
    public void postorder(BstNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.println(" " + root.key);
        }
    }
    public boolean contains(BstNode root, int key) {
        if (root.key == key){
            return true;
        }
        if (root.key > key){
            return contains(root.left, key);
        }
        else{
        return false;
        }
    }
    public void printLeaves(BstNode root)
    {
        if (root == null)
            return;

        if (root.left == null && root.right == null)
        {
            System.out.println( root.key +" ");
            return;
        }

        if (root.right != null)
            printLeaves(root.right);

        if (root.left != null)
            printLeaves(root.left);
    }
    public int getMin(BstNode root) {
        BstNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return (current.key);
    }
    public int getMax(BstNode root) {
        BstNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return (current.key);
    }
    int getDepth(BstNode root)
    {
        if (root == null)
            return 0;
        else
        {
            int lDepth = getDepth(root.left);
            int rDepth = getDepth(root.right);
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

}
