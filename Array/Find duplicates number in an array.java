/*class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (set.contains(nums[i])) {
                duplicates.add(nums[i]);
            }
            set.add(nums[i]);
        }

        return duplicates;
        
    }
}**/
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        
         if(nums[i]==nums[i-1]) 
         res.add(nums[i++]);
        return res;
    }
}