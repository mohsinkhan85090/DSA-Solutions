//Brute force appraoch
class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                return true;
            }
        }
        return false;
    }
}
// Optimized approach 
class solution{
    public boolean containsDuplicate(int [] nums)
    {
        int n = nums.length;
        Arryas.sort(nums);
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1])
            return true;
        }
        return false;
    }
}
//
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i]; 
            if (set.contains(num)) {
                return true;
            }
            set.add(num); 
        }
        return false;
    }
}
//
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
                if(map.containsKey(nums[i]))
                return true;
                map.put(nums[i],i);
        }
        return false;
    }
}