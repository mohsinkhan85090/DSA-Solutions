class Solution {
    public int findDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        
        while(low<high){
            int mid =(low+high)/2;
            int count=0;
            for(int i=0;i<nums.length;i++){
            if(nums[i]<=mid){
                count++;
            }
        }
            if(count>mid){
                high=mid;
            }
            else{
                low =mid+1;
            }
        }
        return low;
    }
}