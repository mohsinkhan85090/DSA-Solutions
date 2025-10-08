class Solution {
    public int findKthLargest(int[] nums, int k) {
        int low =nums[0];
        int high =nums[0];
        for(int i =0 ;i<nums.length;i++)
        {
            if(nums[i]<low)
            {
                low = nums[i];
            }
            if(nums[i]>high)
            {
                high = nums[i];
            }
        }
        while(low <= high)
        {
            int count =0;
            int mid = low +(high-low)/2;
            for(int i=0;i<nums.length;i++)
            {
            if(nums[i]>mid)
            {
                count ++;
            }
            }
            if(count >= k)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
            }
        
        return low;
    }
}