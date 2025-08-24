/**class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum=nums[0];
        int maxsum=nums[0];
        for (int i=1;i<nums.length;i++)
        {
            if(currentsum+nums[i]>nums[i])
            {
                currentsum=currentsum+nums[i];
            }
            else{
                currentsum=nums[i];
            }
            if(currentsum>maxsum)
            {
                maxsum=currentsum;
            }
        }
        return maxsum;

    }
}**/
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        
        return maxSum;
    }
}