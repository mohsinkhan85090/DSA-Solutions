class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         if(root==null)
        {
            return new ArrayList<>();
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        q.offer(root);
        int curr =0;
        while(!q.isEmpty())
        {
            int len = q.size();
            ans.add(new ArrayList<>());
            for(int i =0 ;i <len;i++)
            {
                TreeNode Node = q.poll();
                ans.get(curr).add(Node.val);
                if (Node.left != null) {
                    q.offer(Node.left);
                }
                if(Node.right!= null)
                {
                    q.offer(Node.right);
                }
                
            }
            curr++;
        }
        Collections.reverse(ans);
        return ans;
    }
}