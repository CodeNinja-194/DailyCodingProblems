import java.util.Scanner;

public class Test112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[101];
        int[] b = new int[101];
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        int m = 1001, d = 0;
        d = Math.abs(a[0] - a[n - 1]);
        m = Math.min(m, d);
        int idx1 = 1, idx2 = n;
        
        for (int i = 0; i < n; i++) {
            d = Math.abs(a[i] - a[i + 1]);
            if (m > d) {
                m = d;
                idx1 = i + 1;
                idx2 = i + 2;
            }
        }
        
        System.out.println(idx1 + " " + idx2);
    }
}
