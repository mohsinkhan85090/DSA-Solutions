class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        int temp = 0; 

        for (int i = 1; i <= n && temp < target.length; i++) 
        {
            st.push(i);
            res.add("Push");
            if (i == target[temp])
            {
                temp++; 
            }
             else 
            {
                st.pop(); 
                res.add("Pop");
            }
        }

        return res;
    }
}