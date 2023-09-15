import java.util.Scanner;

public class Test62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] b = new int[200001];
        
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] freq = new int[n + 1];
            int[] idx = new int[n + 1];

            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                freq[a]++;
                idx[a] = i + 1;
            }

            int index = -1;
            for (int i = 0; i <= n; i++) {
                if (freq[i] == 1) {
                    index = idx[i];
                    break;
                }
            }

            System.out.println(index);
        }

        scanner.close();
    }
}
