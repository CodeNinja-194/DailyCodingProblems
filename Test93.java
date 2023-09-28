import java.util.Scanner;
public class Test93 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long n,m,x;
            n=sc.nextLong();
            m=sc.nextLong();
            x=sc.nextLong();
            long col = (x/n);
            if(x%n != 0)col++;
            long row = x % n;
            if(row == 0)row = n;
            long ans = ((row - 1) * m) + col;
            System.out.println(ans);
        }
    }
}
