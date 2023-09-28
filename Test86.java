import java.util.Arrays;
import java.util.Scanner;

public class Test86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a);
            System.out.println(getMaxProduct(a));
        }
    }
    
    // Function to get the maximum product by adding 1 to one digit
    public static long getMaxProduct(int[] a) {
        a[0]++;
        long m = 1;
        for(int it:a) m*=it;
        
        return m;
    }
}
