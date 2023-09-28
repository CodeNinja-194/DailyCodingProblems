import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int d = scanner.nextInt();
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = scanner.nextInt();
            }
            
            ArrayList<Integer> v1 = new ArrayList<>();
            ArrayList<Integer> v2 = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                if (ar[i] <= d) {
                    v1.add(ar[i]);
                } else {
                    v2.add(ar[i]);
                }
            }
            
            if (v2.isEmpty()) {
                System.out.println("YES");
            } else {
                Collections.sort(v1);
                if (v1.size() >= 2) {
                    if (v1.get(0) + v1.get(1) <= d) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
