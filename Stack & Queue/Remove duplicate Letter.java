

class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st= new Stack<>();
        HashSet<Character> k = new HashSet<>();
        for(int i = 0;i<s.length();i++)
        {
            char c =s.charAt(i);
            if(k.contains(c))
            {
                continue;
            }
            while (!st.isEmpty() && c < st.peek() && s.indexOf(st.peek(), i) != -1) {
                k.remove(st.pop());
            }
            st.push(c);
            k.add(c);
        }
        String result = "";
       for (int i = 0; i < st.size(); i++) {
       result += st.get(i); 
    }
    return result;
    }
}