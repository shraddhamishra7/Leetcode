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
    
    boolean ans = true;
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        height(root);
        return ans;
    }
    
    public int height(TreeNode root){
        if(root==null) return 0;
        
        int left = height(root.left);
        int right = height(root.right);
        
        if(ans) ans = Math.abs(left-right)>1 ? false : true;
        System.out.println(ans);
        return Math.max(left,right)+1;
    }
}
