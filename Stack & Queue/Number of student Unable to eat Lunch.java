class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < students.length; i++) {
            q.offer(students[i]);
        }

        int sandwichIndex = 0; 
        int moves = 0;         

        while (!q.isEmpty()) {

            int front = q.peek();         
            int top = sandwiches[sandwichIndex]; 

            if (front == top)
            {
                q.poll();
                sandwichIndex++;
                moves = 0;
            } else {
                q.offer(q.poll());
                moves++;
                if (moves == q.size())
                 {
                    return q.size();
                }
            }
        }

        return 0;
    }
}