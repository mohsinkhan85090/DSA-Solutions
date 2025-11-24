class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!st.isEmpty()) {
                char top = st.peek();
                    if ((c + 32 == top) || (c - 32 == top)) {
                    st.pop();
                    continue;
                }
            }
            st.push(c);
        }
        String ans = "";
        while (!st.isEmpty()) {
            ans = st.pop() + ans;
        }

        return ans;
    }
}
