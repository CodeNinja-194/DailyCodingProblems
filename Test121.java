import java.util.Arrays;
import java.util.Scanner;

public class Test121 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        while(T --> 0)
        {
            int n = sc.nextInt();
            int a[]=new int[n];
            Arrays.fill(a,0);
            for(int i = 0 ; i < n ; i ++)  a[i] = sc.nextInt();
            Arrays.sort(a,0,n);
            long sum = 0;
            double res = 0;
            for(int i = 0 ; i < n - 1 ; i ++)  sum += a[i];
            res += (double)sum / (n - 1);
            res += (double)a[n - 1];
            System.out.println(res);
        }
    }
}
