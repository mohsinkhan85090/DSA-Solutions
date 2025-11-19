class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {

            String t = tokens[i];

            if (t.equals("+")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a + b);
            } 
            else if (t.equals("-")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a - b);
            } 
            else if (t.equals("*")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a * b);
            } 
            else if (t.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a / b);  
            } 
            else {
                st.push(Integer.parseInt(t));
            }
        }

        return st.pop();
        }
    }
