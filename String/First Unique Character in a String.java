class Solution {
    public int firstUniqChar(String s) {
        int count=0;
        for (int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if (s.charAt(i)==s.charAt(j))
            {
                return i+j;
            }

            }
            
        }
        return -1;
        
    }
}