import java.util.Scanner;

public class Test134 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            long x = scanner.nextLong();
            long minSum = (k * (k + 1)) / 2;
            long totalSum = (n * (n + 1)) / 2;
            long maxSum = totalSum - ((n - k) * (n - k + 1)) / 2;
            
            if (x >= minSum && x <= maxSum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}
