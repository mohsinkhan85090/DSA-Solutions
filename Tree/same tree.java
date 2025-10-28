// Recursive approach 

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q== null)
        {
            return true;
        }
        if(p==null||q==null)
        {
            return false;
        }
        
         return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }
}

// iterative approach

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        Stack<TreeNode> st= new Stack<>();
        st.push(p);
        st.push(q);
        while(!st.isEmpty())
        {
            TreeNode node1= st.pop();
            TreeNode node2= st.pop();
            if(node1 == null && node2 == null)
            {
                continue;
            }
            if(node1 == null || node2 == null || node1.val!= node2.val)
            {
                return false;
            }
            st.push(node1.left);
            st.push(node2.left);
            st.push(node1.right);
            st.push(node2.right);


        }
        return true;

    }
}