class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s==null || t== null)
        {
            return false;
        }
        if(s.length() != t.length())
        {
            return false;
        }
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        for(int  i=0 ;i<sarr.length;i++)
        {
            if(sarr[i]!=tarr[i])
            {
                return false;
            }
        }
        return true;
    }
}
