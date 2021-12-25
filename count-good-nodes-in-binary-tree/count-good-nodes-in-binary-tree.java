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
    public int goodNodes(TreeNode root) {
        if(root == null)
            return 0;
        return dfs(root,root.val);
    }
    public int dfs(TreeNode root, int currMax){
        if(root == null)
            return 0;
        
        if(currMax <= root.val){
            currMax = root.val;
            return 1 + dfs(root.left,currMax)+dfs(root.right,currMax);
        }
        else{
            return dfs(root.left,currMax) + dfs(root.right,currMax);
        }
    }
}