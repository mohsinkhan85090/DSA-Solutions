class Solution {
    public boolean checkifarrayissortedandrotated(int[] arr) {
        int n=arr.length;
        int rotate=0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[(i+1)%n]){
                rotate++;
            }
        }
        if(rotate<=1){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}