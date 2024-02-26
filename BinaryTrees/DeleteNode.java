package BinaryTrees;

public class DeleteNode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = null;
        root.right.right = new TreeNode(7);

        int key = 3;
        TreeNode result = deleteNode(root, key);
        printLevelOrder(result);
    }

    public static TreeNode deleteNode(TreeNode root, int key) {
        //scenario if root is null
        if(root == null) {
            return null;
        }
        //finding the key of which the node is deleted.
        if(key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if(root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            TreeNode node = findSuc(root.right);
            root.val = node.val;
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    public static TreeNode findSuc(TreeNode node) {
        while(node.left != null) {
            node = node.left;
        }
        return node;
    }

    public static int height(TreeNode root)
    {
        if (root == null)
            return 0;
        else {
            /* compute height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);
 
            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
 
    /* Print nodes at a given level */
    public static void printGivenLevel(TreeNode root, int level)
    {
        if (root == null)
            return;
        if (level == 1) {
            System.out.print(root.val + " ");
        }
        else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }
 
    /* function to print level order traversal of tree*/
    public static void printLevelOrder(TreeNode root)
    {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++) {
            printGivenLevel(root, i);
            System.out.print(System.lineSeparator());
        }
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
