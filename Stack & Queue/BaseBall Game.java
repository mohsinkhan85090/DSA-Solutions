class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<operations.length;i++)
        {
            String op =operations[i];
            if(op.equals("C"))
            {
                st.pop();
            }
            else if(op.equals("D"))
            {
                st.push(st.peek() * 2);
            }
            else if (op.equals("+")) {
                int top = st.pop();
                int newTop = top + st.peek();
                st.push(top);
                st.push(newTop);
            } 
            else {
                st.push(Integer.parseInt(op));
            }
        }
       int sum =0;
       for(int i =0;i<st.size();i++)
       {
        sum += st.get(i);
       }
       return sum;

    }
}