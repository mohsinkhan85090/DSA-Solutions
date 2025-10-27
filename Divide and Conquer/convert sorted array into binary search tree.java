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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;

        int n = nums.length;
        TreeNode root = new TreeNode(0);
        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> rightStack = new Stack<>();

        nodeStack.push(root);
        leftStack.push(0);
        rightStack.push(n - 1);

        while (!nodeStack.isEmpty()) {
            TreeNode curr = nodeStack.pop();
            int left = leftStack.pop();
            int right = rightStack.pop();

            int mid = (left + right) / 2;
            curr.val = nums[mid];

         
            if (mid + 1 <= right) {
                curr.right = new TreeNode(0);
                nodeStack.push(curr.right);
                leftStack.push(mid + 1);
                rightStack.push(right);
            }

            if (left <= mid - 1) {
                curr.left = new TreeNode(0);
                nodeStack.push(curr.left);
                leftStack.push(left);
                rightStack.push(mid - 1);
            }
        }

        return root;
    }
}