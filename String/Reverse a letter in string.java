class Solution {
    public String reverseOnlyLetters(String s) {
        char[] c = s.toCharArray();
        int left = 0;
        int right = c.length - 1;

        while (left < right) {
            if (!Character.isLetter(c[right])) {
                right--;
            } else if (!Character.isLetter(c[left])) {
                left++;
            } else {
                char temp = c[right];
                c[right] = c[left];
                c[left] = temp;
                left++;
                right--;
            }
        }
        return new String(c);
    }
}