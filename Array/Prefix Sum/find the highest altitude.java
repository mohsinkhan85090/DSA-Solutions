class Solution {
    public int largestAltitude(int[] gain) {
        int currentAltitude =0 ;
        int maxaltitude =0;
        for(int i=0;i<gain.length;i++)
        {
            currentAltitude += gain[i];
            maxaltitude =Math.max(currentAltitude,maxaltitude);
        }
        return maxaltitude;
    }
}