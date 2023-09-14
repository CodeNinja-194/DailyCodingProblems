import java.util.*;
public class Test18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int diff = Math.abs(a-b);
            int values = diff*2;
            if(a>values || b>values || c>values)System.out.println(-1);
            else
            {
                int d = c + diff;
                if(d>values)
                    d = c - diff;
                System.out.println(d);
            }
        }
    }
}
