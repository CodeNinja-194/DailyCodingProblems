import java.util.Scanner;

public class Test89 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long n = scanner.nextLong();
            long x = scanner.nextLong();
            long[] nums = new long[(int) n];

            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextLong();
            }

            long i = 1, j = (long) 1e10;
            long ans = 1;

            while (i <= j) {
                long mid = (i + j) / 2;
                long water = 0;

                for (long a : nums) {
                    if (a < mid) {
                        water += mid - a;
                    }
                }

                if (water > x) {
                    j = mid - 1;
                } else {
                    ans = Math.max(ans, mid);
                    i = mid + 1;
                }
            }

            System.out.println(ans);
        }
    }
}
