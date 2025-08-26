class Solution {
    public boolean isSubsequence(String s, String t) {
     int a=0;
     int b=0;
     while(a<s.length() && b<t.length())
     {
        if(s.charAt(a) == t.charAt(b))
        {
            a++;
        }
        b++;
     } 
     return a==s.length();
    }
}