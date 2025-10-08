class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int currentSum = 0;
    for (int i = 0; i < k; i++) {
        currentSum += nums[i];
    }

    double maxsum = currentSum;
    for (int i = k; i < nums.length; i++) 
    {
        currentSum += nums[i] - nums[i-k];
        maxsum = Math.max(maxsum,currentSum); 
        
    }

    return maxsum/k;
}
}

/**class Solution {
    public double findMaxAverage(int[] nums, int k) {
    double currentSum = 0;
    for (int i = 0; i < k; i++) {
        currentSum += nums[i];
    }

    double maxAvg = currentSum / k;  
    for (int i = k; i < nums.length ; i++) 
    {
        currentSum += nums[i] - nums[i - k]; 
        double currentAvg = currentSum / k;
        if (currentAvg > maxAvg) {
            maxAvg = currentAvg;
        }
    }

    return maxAvg;
}
        
    }**/
