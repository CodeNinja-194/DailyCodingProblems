import java.util.Scanner;

public class Test120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tt = scanner.nextInt();
        
        while (tt-- > 0) {
            int n = scanner.nextInt();
            int[] v = new int[101]; // create an array with a size of 101 (to avoid overflow)

            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                // record the number of occurrences of an element
                v[a]++;
            }
            int ans = Integer.MIN_VALUE;
            for (int x : v) {
                // get the max frequency of an element
                ans = Math.max(ans, x);
            }
            System.out.println(ans);
        }
    }
}
