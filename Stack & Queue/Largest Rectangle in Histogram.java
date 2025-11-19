class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>st = new Stack<>();
        int maxArea =0;
        for(int i =0 ;i<=heights.length;i++ )
        {
            int currHeight;
            if (i < heights.length) {
                currHeight = heights[i];   
            } else {
                currHeight = 0;              
            }
            while (!st.isEmpty() && currHeight < heights[st.peek()]) {
                int height = heights[st.pop()];
                int right = i;
                int left = st.isEmpty() ? -1 : st.peek();
                int width = right - left - 1;

                maxArea = Math.max(maxArea, height * width);
            }
            st.push(i);

        }
        return maxArea;
    }
}