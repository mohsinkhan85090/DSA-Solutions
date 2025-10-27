// Iterative approach 
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


// recursive approach


class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
            return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    
    }
}