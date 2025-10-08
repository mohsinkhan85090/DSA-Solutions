class Solution {
    public char findTheDifference(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        for(int i=0;i<s.length();i++)
        {
            if(sArr[i]!=tArr[i])
            return tArr[i];
        }
        return tArr[tArr.length-1];
        
    }
}