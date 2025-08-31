/**class Solution {
    public void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder(new String(s));
        sb.reverse();
        
        for (int i = 0; i < s.length; i++) {
            s[i] = sb.charAt(i);
        }
    }
}**/
class Solution {
    public void reverseString(char[] s) {
        int start=0;
        int end =s.length-1;
        while(start<end ){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
}