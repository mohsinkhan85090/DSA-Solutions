class Solution {
    public String clearDigits(String s) {
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            if (Character.isDigit(c))
             {
                if (!st.isEmpty()) 
                {
                    st.pop(); 
                }
            }
            else 
            {
                st.push(c); 
            }
        
    } 
    String result = "";
        for (int i = 0; i < st.size(); i++) {
            result = result + st.get(i);
        }

        return result;
}
}