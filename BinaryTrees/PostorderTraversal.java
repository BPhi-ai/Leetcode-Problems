package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        
        List<Integer> list = postorderTraversal(root);
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        return postOrder(list, root);
    }

    public static List<Integer> postOrder(List<Integer> list, TreeNode root) {
        if(root != null) {
            postOrder(list, root.left);
            postOrder(list, root.right);
            list.add(root.val);
        }
        return list;
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
