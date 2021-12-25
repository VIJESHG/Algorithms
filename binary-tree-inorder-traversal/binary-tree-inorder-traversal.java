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
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode node = root;
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stk = new Stack<TreeNode>();
        
        while(node != null || !stk.empty()){
            while(node != null){
                stk.add(node);
                node = node.left;
            }
            node = stk.pop();
            result.add(node.val);
            node = node.right;
        }
        return result;
    }
}