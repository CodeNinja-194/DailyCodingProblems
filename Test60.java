import java.util.*;

public class Test60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n, k;
            n = sc.nextLong();
            k = sc.nextLong();

            // Check if it is possible to represent n burles
            // using coins with denominations 2 and k.
            // If n is even or k is 1, then it is always possible.
            // Otherwise, it is possible only if (n - k) is also even.
            if ((n % 2 == 0) || (k == 1) || ((n - k) % 2 == 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
