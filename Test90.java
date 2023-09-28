import java.util.Scanner;

public class Test90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int[] fruits = new int[n];
            int[] height = new int[n];

            for (int i = 0; i < n; i++) {
                fruits[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                height[i] = scanner.nextInt();
            }

            int i = 0, j = 0, sum = 0;
            int ans = 0;

            while (j < n) {
                sum += fruits[j];

                while (sum > k && i <= j) {
                    sum -= fruits[i];
                    i++;
                }

                ans = Math.max(ans, j - i + 1);

                if (j + 1 >= n || height[j] % height[j + 1] != 0) {
                    i = j + 1;
                    sum = 0;
                }

                j++;
            }

            System.out.println(ans);
        }
    }
}
