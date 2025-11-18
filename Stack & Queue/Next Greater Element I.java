// Brute force approach just uses two loop

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] res = new int [n];
        for(int i =0 ;i<n ; i++)
        {
           int nextgreater =-1;
           for(int j =0; j<nums2.length; j++)
           {
            if(nums2[j] == nums1[i])
            {
                for(int k = j+1; k< nums2.length; k++)
                {
                    if(nums2[k]>nums1[i])
                    {
                        nextgreater = nums2[k];
                        break;
                    }
                }
                break;
            }
            
           }
           res[i] = nextgreater;
        }
        return res;
    }
}

// Optimized approach using Monotonic decreasing stack
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[]  next =  new int [nums2.length];
        Stack<Integer>st = new Stack<>();
        for(int i =nums2.length-1; i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<= nums2[i])
            {
                st.pop();
            }
            next[i] = st.isEmpty()? -1: st.peek();
            st.push(nums2[i]);
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    res[i] = next[j];
                    break;
                }
            }
        }
        return res;
    }
}


//optimized approach using HashMap and Monotonic decreasing stack