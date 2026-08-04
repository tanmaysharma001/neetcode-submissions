/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {

        if(root == null){
            return 0;
        }

        int left = heightOfTree(root.left);
        int right = heightOfTree(root.right);
        int dia = left + right;
        int sub = Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));
        return Math.max(dia, sub);
    }

    int heightOfTree(TreeNode root){

        if(root == null){
            return 0;
        }

        return 1 + Math.max(heightOfTree(root.left), heightOfTree(root.right));
    }

    
}
