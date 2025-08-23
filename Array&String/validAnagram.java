class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null) return false;
         if (s.length() != t.length()) return false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] != tArr[i]) {
                return false;
            }
        }
        return true;

    }
}