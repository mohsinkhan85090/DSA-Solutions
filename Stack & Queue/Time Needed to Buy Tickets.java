class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time=0;
        for(int i =0;i<tickets.length;i++)
        {
            if(i<=k)
            {
                time += Math.min(tickets[k],tickets[i]);

            }
            else
            {
                time += Math.min(tickets[k]-1,tickets[i]);
            }
        }
        return time;
    }
}


/**
 *class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            q.add(i);
        }

        int time = 0;

        while (!q.isEmpty()) {
            int i = q.poll();
            tickets[i]--;
            time++;

            if (tickets[i] > 0) {
                q.add(i);
            }

            if (i == k && tickets[i] == 0) {
                break;
            }
        }

        return time;
    }
}
 */