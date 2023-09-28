import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Test92 {
    static ArrayList<ArrayList<Integer>> g;
    static ArrayList<Integer> put;
    static ArrayList<Boolean> cycle, used;
    static boolean was;

    static void dfs(int u, int pred) {
        used.set(u, true);
        put.add(u);
        for (int v : g.get(u)) {
            if (v == pred) {
                continue;
            }
            if (used.get(v)) {
                cycle.set(v, true);
                while (put.get(put.size() - 1) != v) {
                    cycle.set(put.get(put.size() - 1), true);
                    put.remove(put.size() - 1);
                }
                was = true;
                return;
            }
            dfs(v, u);
            if (was) {
                return;
            }
        }
        if (was) {
            return;
        }
        put.remove(put.size() - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        while (q-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            g = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                g.add(new ArrayList<>());
            }
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                g.get(u).add(v);
                g.get(v).add(u);
            }
            ArrayList<Integer> dista = new ArrayList<>(Collections.nCopies(n + 1, (int)1e9));
            ArrayList<Integer> distb = new ArrayList<>(Collections.nCopies(n + 1, (int)1e9));
            dista.set(a, 0);
            PriorityQueue<Pair<Integer, Integer>> queueA = new PriorityQueue<>(Comparator.comparingInt(Pair::getKey));
            queueA.add(new Pair<>(0, a));
            while (!queueA.isEmpty()) {
                Pair<Integer, Integer> pair = queueA.poll();
                int d = pair.getKey();
                int u = pair.getValue();
                if (dista.get(u) != d) {
                    continue;
                }
                for (int v : g.get(u)) {
                    if (dista.get(v) > d + 1) {
                        dista.set(v, d + 1);
                        queueA.add(new Pair<>(d + 1, v));
                    }
                }
            }
            distb.set(b, 0);
            PriorityQueue<Pair<Integer, Integer>> queueB = new PriorityQueue<>(Comparator.comparingInt(Pair::getKey));
            queueB.add(new Pair<>(0, b));
            while (!queueB.isEmpty()) {
                Pair<Integer, Integer> pair = queueB.poll();
                int d = pair.getKey();
                int u = pair.getValue();
                if (distb.get(u) != d) {
                    continue;
                }
                for (int v : g.get(u)) {
                    if (distb.get(v) > d + 1) {
                        distb.set(v, d + 1);
                        queueB.add(new Pair<>(d + 1, v));
                    }
                }
            }
            put = new ArrayList<>();
            cycle = new ArrayList<>(Collections.nCopies(n + 1, false));
            used = new ArrayList<>(Collections.nCopies(n + 1, false));
            was = false;
            dfs(1, 0);
            boolean can = false;
            for (int i = 1; i <= n; i++) {
                if (cycle.get(i) && distb.get(i) < dista.get(i)) {
                    can = true;
                }
            }
            if (can) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
    static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
