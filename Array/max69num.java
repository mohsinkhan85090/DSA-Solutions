class Solution {
    public int max69Num (int num) {
        // Convert int → char array (digits)
        char[] n = String.valueOf(num).toCharArray();
        for(int i=0;i<n.length;i++)
        {
            if (n[i]=='6')
            {
                n[i]='9';
                break;
            }
        }
        // Convert back to integer
        return Integer.parseInt(new String(n));
    }
}