package BinaryTrees;

public class InsertNode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        
        InsertNode.insert(root, 50);
        InsertNode.insert(root, 30);
        InsertNode.insert(root, 20);
        InsertNode.insert(root, 40);
        InsertNode.insert(root, 70);
        InsertNode.insert(root, 60);
        InsertNode.insert(root, 80);

        InsertNode.inOrder(root);
    }

    public static void insert(TreeNode root, int val) {
        root = insertRec(root, val);
    }

    public static TreeNode insertRec(TreeNode root, int val) {
        if(root == null) {
            root = new TreeNode(val);
            return root;
        } else if (val < root.val) {
            root.left = insertRec(root.left, val);
        } else if (val > root.val) {
            root.right = insertRec(root.right, val);
        }
        return root;
    }

    public static void inOrder(TreeNode root) {
        inOrderRec(root); 
    }

    public static void inOrderRec(TreeNode root) {
        if(root != null) {
            inOrderRec(root.left);
            System.out.print(root.val + " ");
            inOrderRec(root.right);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left, right;
    public TreeNode() {

    }
    public TreeNode(int val) {
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
