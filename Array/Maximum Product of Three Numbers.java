class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int prod1 = nums[n-1]*nums[n-2]*nums[n-3];
        int prod2 = nums[0]*nums[1]*nums[n-1];
        if(prod1>prod2)
        {
            prod2=prod1;
        }
        
        return prod2;
    }
}