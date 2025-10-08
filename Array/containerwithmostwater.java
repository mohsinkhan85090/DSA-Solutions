class Solution {
    public int maxArea(int[] height) {
        int low =0;
        int maxarea =0;
        int high = height.length-1;
        while(low <= high)
        {
            maxarea = Math.max(maxarea, (high - low) * Math.min(height[low], height[high]));
            if(height[low]<height[high])
            {
                low++;
            }
            else
            {
                high--;
            }
        }
        return maxarea;

    }
}