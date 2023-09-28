import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();

            List<Pair> v = new ArrayList<>();
            for (long p = 0; p < n; p++) {
                long first = scanner.nextLong();
                v.add(new Pair(first, scanner.nextLong()));
            }

            Collections.sort(v);

            long ram = k;
            for (int p = 0; p < n; p++) {
                if (ram < v.get(p).first) {
                    break;
                }
                ram += v.get(p).second;
            }

            System.out.println(ram);
        }
    }

    static class Pair implements Comparable<Pair> {
        long first;
        long second;

        Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair other) {
            return Long.compare(this.first, other.first);
        }
    }
}
