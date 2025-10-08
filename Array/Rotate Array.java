class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // To handle cases where k > n

        // Reverse the entire array
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        // Reverse the first k elements
        start = 0;
        end = k - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        // Reverse the remaining n-k elements
        start = k;
        end = n - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
