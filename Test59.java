import java.util.Scanner;

public class Test59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int max = Integer.MIN_VALUE;
            int maxCount = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                if (a[i] > max) {
                    max = a[i];
                    maxCount = 1;
                } else if (a[i] == max) {
                    maxCount++;
                }
            }
            for (int i = 0; i < n; i++) {
                if (a[i] == max) {
                    System.out.print((maxCount - 1) + " ");
                } else {
                    System.out.print(maxCount + " ");
                }
            }
            System.out.println();
        }
    }
}
