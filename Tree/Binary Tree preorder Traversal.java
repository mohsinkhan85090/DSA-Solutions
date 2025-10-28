class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !s.isEmpty()) {
            while (curr != null) {
                ans.add(curr.val);
                s.push(curr);
                curr = curr.right;
            }
            curr = s.pop();
            curr = curr.left;
        }
        Collections.reverse(ans);

        return ans;
    }
}