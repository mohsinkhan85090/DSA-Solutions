class Solution {
    public int strStr(String haystack, String needle) {
        int a = needle.length();
        int b = haystack.length();
       if (a == 0) {
        return 0;
       }
        if (b < a) 
        {
        return -1;
           }
     for (int i = 0; i <= b-a; i++)
     {
         if (haystack.substring(i, i + a).equals(needle)) {
                return i;
            }
    }
    return -1;
    }
}

