import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int s : scoville) {
            pq.offer((long) s);
        }

        int count = 0;

        while (pq.size() >= 2 && pq.peek() < K) {
            long first = pq.poll();
            long second = pq.poll();

            long mixed = first + second * 2;
            pq.offer(mixed);

            count++;
        }

        return pq.peek() >= K ? count : -1;
    }
}