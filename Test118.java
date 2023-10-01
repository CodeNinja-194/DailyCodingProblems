import java.util.Scanner;

public class Test118 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int[] row = new int[11];
        int[] col = new int[11];

        for (int i = 0; i < r; ++i) {
            String s = scanner.next();
            for (int j = 0; j < c; ++j) {
                if (s.charAt(j) == 'S') {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        int cakes = 0;
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                if (row[i] == 0 || col[j] == 0) {
                    cakes += 1;
                }
            }
        }

        System.out.println(cakes);
    }
}
