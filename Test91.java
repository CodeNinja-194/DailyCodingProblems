import java.util.Scanner;

public class Test91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        while (test-- > 0) {
            String s = scanner.next();
            int n = s.length();
            int a = 0;
            int b = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'A') {
                    a++;
                }
                if (s.charAt(i) == 'B') {
                    b++;
                }
            }

            int m = Integer.MAX_VALUE;
            int curr = 0;
            boolean aman = false;
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'A') {
                    if (!aman) {
                        cnt++;
                        aman = true;
                    }
                    curr++;
                } else {
                    aman = false;
                    m = Math.min(m, curr);
                    curr = 0;
                }
                if (i == n - 1 && curr != 0) {
                    m = Math.min(m, curr);
                }
            }

            if (a == n) {
                System.out.println(0);
            } else if (b >= cnt) {
                System.out.println(a);
            } else {
                System.out.println(a - m);
            }
        }
    }
}
