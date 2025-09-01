
class Solution {
    public int strStr(String haystack, String needle) {
        int nl = needle.length();
        int hl = haystack.length();
       if (nl == 0) {
        return 0;
       }
        if (hl < nl) 
        {
        return -1;
           }
     for (int i = 0; i <= hl - nl; i++)
     {
         if (haystack.substring(i, i + nl).equals(needle)) {
                return i;
            }
    }
    return -1;
    }
}

