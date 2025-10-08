
// Brute force approach

class Solution {
    public static boolean linearSearch(int []nums, int num) {
        int n = nums.length; //size of array
        for (int i = 0; i < n; i++) {
            if (nums[i] == num)
                return true;
        }
        return false;
    }
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
        {
            return 0;
        }
        int n = nums.length;
        int longest = 1;
        for(int i =0;i<n;i++)
        {
           int x= nums[i];
           int count =1;
           while(linearSearch(nums,x+1)==true)
           {
            x +=1;
            count+=1;
           }
           longest=Math.max(longest,count);
        }
        return longest;
        
    }
}

//better approach

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        Arrays.sort(nums);
        int count =0;
        int lastsmaller=Integer.MIN_VALUE;
        int longest=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]-1==lastsmaller)
            {
                count +=1;
                lastsmaller+=1;
            }
            else if(nums[i]!=lastsmaller)
            {
                count =1;
                lastsmaller = nums[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
        
    }
}

//optimal approach
class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        Object[] arr = set.toArray();
        for (int i = 0; i < arr.length; i++) {
            int it = (Integer) arr[i];  
            if (!set.contains(it - 1)) {
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}
