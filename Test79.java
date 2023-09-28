import java.util.Scanner;
public class Test79 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();  // Length of the string
            int m = sc.nextInt();  // Length of the secret code
            String s = sc.next();  // The string
            String k = sc.next();  // The secret code
            int minMoves = findMinMoves(n, m, s, k);
            System.out.println(minMoves);
        }
        sc.close();
    }

    public static int findMinMoves(int n, int m, String s, String k) {
        int minMoves = Integer.MAX_VALUE;

        for (int i = 0; i <= n - m; i++) {
            int moves = 0;
            for (int j = 0; j < m; j++) {
                int diff = Math.abs(s.charAt(i + j) - k.charAt(j));
                moves += Math.min(diff, 10 - diff);
            }
            minMoves = Math.min(minMoves, moves);
        }

        return minMoves;
    }
}