package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        
        List<Integer> list = preorderTraversal(root);
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

     public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        return preOrder(list, root);
    }

    public static List<Integer> preOrder(List<Integer> list, TreeNode root) {
        if(root != null) {
            list.add(root.val);
            preOrder(list, root.left);
            preOrder(list, root.right);
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
