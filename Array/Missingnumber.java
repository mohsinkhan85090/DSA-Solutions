// optimal approach
class Solution {
    public int MissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}

// Brute force
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n =nums.length;
        if(nums[0]!=0){
            return 0;
        }
        if (nums[n - 1] != n) return n;
        for(int i=1;i<n;i++)
        {
            if(nums[i]!=i)
            return i;
        }
        return 0;
    }
}