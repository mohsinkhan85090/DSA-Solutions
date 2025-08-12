// Brute force//
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
                
            }
        }
        return new int[]{-1,-1};
    }
}
// optimal approach
 class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n= nums.length;
        for(int i=0;i<n;i++)
        {
            int num =nums[i];
            int more= target - num;
            if(mp.containsKey(more))
            {
                return new int[]{mp.get(more),i};
            }
            mp.put(num, i);
        }
        return new int []{};
    }
}