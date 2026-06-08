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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> lst = new ArrayList<Integer>();
        order(root, lst);
        return lst.get(k-1);
    }

    public void order(TreeNode root, List<Integer> lst) {
        if(root == null) return;
        order(root.left, lst);
        lst.add(root.val);
        order(root.right, lst);
    }
}
