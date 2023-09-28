import java.util.Scanner;

public class Test103
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long r=sc.nextLong();
            long b=sc.nextLong();
            long d=sc.nextLong();
            // System.out.println((a>=1 && b>=1 && Math.abs(a-b)<=c)?"YES":"NO");
            long differ =Math.abs(r - b) ;
            long mn = Math.min(r , b) ;
            long each = ( differ + mn - 1) / mn ;
            System.out.println((each <= d)?"YES":"NO");
        }
    }
}