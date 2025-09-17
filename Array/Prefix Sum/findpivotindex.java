class Solution {
    public int pivotIndex(int[] nums) {
        int n =  nums.length;
        int sum= 0;
        for(int i =0;i<n;i ++)
        {
            sum += nums[i];
        }
        int leftsum =0;
        for(int i =0;i<n ;i++)
        {
            int rightsum = sum -leftsum -nums[i];
            if(rightsum == leftsum)
            {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}