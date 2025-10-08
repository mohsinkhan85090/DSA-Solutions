
public class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] result = new int[nums.length];
        int low = 0;
        int high = nums.length - 1;
        int i = nums.length- 1;

        while(low <= high) {
            if (Math.abs(nums[low]) >= Math.abs(nums[high])) {
                result[i] = nums[low] * nums[low];
                low++;
            } else {
                result[i] = nums[high] * nums[high];
                high--;
            }
            i--;
        }
        return result;
    }
}