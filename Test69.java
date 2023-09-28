import java.util.Scanner;
public class Test69 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int w=sc.nextInt();
            int h=sc.nextInt();
            int n=sc.nextInt();
            int ans=1;
            if(n == 1)
            {
                System.out.println("YES");
                continue;
            }
            while(w % 2 == 0)
            {
                ans *= 2;
                w = w / 2;
            }
            while(h % 2 == 0)
            {
                ans *= 2;
                h = h / 2;
            }
            if( n <= ans)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
