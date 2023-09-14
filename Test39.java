import java.util.*;

public class Test39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a[] = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = sc.nextInt();
        }
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(minimumMultiplications(a, start, end));
    }

    public static int minimumMultiplications(int arr[], int start, int end) {
        int MOD = 100000;
        PriorityQueue<State> pq = new PriorityQueue<>(Comparator.comparingInt(s -> s.steps));
        Set<Integer> visited = new HashSet<>();
        pq.offer(new State(start, 0));
        visited.add(start);

        while (!pq.isEmpty()) {
            State current = pq.poll();
            if (current.value == end) {
                return current.steps;
            }

            for (int factor : arr) {
                int next = (current.value * factor) % MOD;
                if (!visited.contains(next)) {
                    pq.offer(new State(next, current.steps + 1));
                    visited.add(next);
                }
            }
        }

        return -1; // If 'end' cannot be reached.
    }

    static class State {
        int value;
        int steps;

        public State(int value, int steps) {
            this.value = value;
            this.steps = steps;
        }
    }
}
