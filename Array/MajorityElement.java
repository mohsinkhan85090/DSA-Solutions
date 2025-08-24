class Solution {
    public int majorityElement(int[] nums) {
        int value=nums[0];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                value = nums[i];
                count++;
            } else if (nums[i] == value) {
                count++;
            } else {
                count--;
            }
        }
        return value;
    }
}