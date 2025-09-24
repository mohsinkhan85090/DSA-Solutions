class Solution {
    public String reverseStr(String s, int k) {
        char[] c =s.toCharArray();
        int n =c.length;
        for(int i=0;i<n;i += 2*k)
        {
             int start =i;
             int end = Math.min(i + k - 1, n - 1);
             while(start <end){
                char temp = c[start];
                c[start]=c[end];
                c[end]=temp;
                start++;
                end--;
                 }



 
    


                                                   

        }
        return new String(c);
        
    }
}