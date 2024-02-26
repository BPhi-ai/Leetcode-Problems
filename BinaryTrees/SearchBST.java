package BinaryTrees;

public class SearchBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int val = 2;
        TreeNode result = searchBST(root, val);
        System.out.println("[" + result.val + ", " + result.left.val + ", " + result.right.val + "]" );
        
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if(root == null) {
            return null;
        }
        if(root.val == val) {
            return root;
        }
        if(val < root.val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }

    public static void printNodes(TreeNode node) {
        if(node == null) {
            return;
        }
        if(node.left == null && node.right == null) {
            System.out.print(node.val + " ");
        }
        printNodes(node.left);
        printNodes(node.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {

    }
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
