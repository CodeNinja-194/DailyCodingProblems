import java.util.Scanner;

public class Test80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            long N = scanner.nextLong(); // Array size
            long L = scanner.nextLong(); // Left range
            long R = scanner.nextLong(); // Right range

            long result = calculateSum(N, L, R);
            System.out.println(result);
        }

        scanner.close();
    }

    private static long calculateSum(long N, long L, long R) {
        long MOD = 1000000007L;
        long result = 0;

        // Find the largest power of 2 that is less than or equal to N
        long powOf2 = 1;
        while (powOf2 * 2 <= N) {
            powOf2 *= 2;
        }

        // Calculate the sum using a recursive function
        while (powOf2 >= 1) {
            long halfN = N / 2;

            if (L <= halfN + 1 && R >= halfN + 1) {
                // The current segment includes the midpoint
                long midpoint = N % 2 == 0 ? halfN : halfN + 1;
                long count = Math.min(R - halfN, midpoint - L + 1);
                result = (result + count * powOf2) % MOD;
                L = L + count;
                R = R - count;
            }

            // Move to the next level of recursion
            N = halfN;
            powOf2 /= 2;
        }

        return result;
    }
}
