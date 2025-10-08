class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start =0;
        int result =nums.length+1;
        int sum =0;
        for(int end =0;end<nums.length;end++)
        {
            
            sum += nums[end];
            while(sum>=target)
            {
                result =Math.min(result, end-start +1);
                sum -=nums[start];
                start++;
            }
        }
        if (result == nums.length + 1) {
            return 0;
        } else {
            return result;
        
    }
}
}