import java.util.*;
public class Test53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int  n=sc.nextInt();
            long a[]=new long[n];
            for( int i  = 0; i < n; i++ )
            {
                a[i]=sc.nextLong();
            }
            Arrays.sort(a);

            long A = 0;
            for (int i = 0; i < n - 2; i++) {
                if (a[i] == a[i + 1] && a[i] == a[i + 2]) {
                    A = 1;
                    System.out.println(a[i]);
                    break;
                }
            }

            // If no element appears at least three times, print -1
            if (A == 0) {
                System.out.println("-1");
            }
        }
    }
}
