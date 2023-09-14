import java.util.*;
public class Test23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int x = n % 7;
            int y = 7 - x;
            int xx = n % 10;
            if (n % 7 == 0)
                n = n+0;
            else if (xx + y < 10)
                n += y;
            else
                n -= x;
            System.out.println(n);
        }
    }
}
