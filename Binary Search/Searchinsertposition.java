class Searchinsertposition
 {
    public int searchInsert(int[] nums, int target) {
        int left =0;
        int right= nums.length-1;
        int i=nums.length;
        while(left<=right)
        {
            int mid = left +(right-left)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                i = mid;
                right=mid-1;
            }
        }
        return i;
    }
}