class Solution {
    public int maxProduct(int[] nums) {
        int maxprod = nums[0];
        int minprod = nums[0]; 
        int result = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int temp = maxprod;
            
            maxprod = Math.max(nums[i], Math.max(maxprod * nums[i], minprod * nums[i]));
            minprod = Math.min(nums[i], Math.min(temp * nums[i], minprod * nums[i]));
            
            result = Math.max(result, maxprod);
        }
        return result;
    }
}
