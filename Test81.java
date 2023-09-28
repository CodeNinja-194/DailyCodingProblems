import java.util.Arrays;
import java.util.Scanner;

public class Test81{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt();  // Number of enemies
            int m = scanner.nextInt();  // Chef's initial strength
            int[] strengths = new int[n];
            int totalStrength = 0;

            for (int i = 0; i < n; i++) {
                strengths[i] = scanner.nextInt();
            }

            Arrays.sort(strengths);

            for (int i = 0; i < n; i++) {
                if (totalStrength < strengths[i] && m <= strengths[i]) {
                    totalStrength += strengths[i];
                } else {
                    m -= strengths[i];
                }
            }

            System.out.println(totalStrength);
        }

        scanner.close();
    }
}
