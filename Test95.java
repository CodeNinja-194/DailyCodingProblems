import java.util.Scanner;
public class Test95 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long a,b,c,x,y;
            a=sc.nextLong();
            b=sc.nextLong();
            c=sc.nextLong();
            x=sc.nextLong();
            y=sc.nextLong();
            int want = 0;
            if(x > a) want+=(x-a);
            if(y > b) want+=(y-b);
            System.out.println((want <= c)?"YES":"NO");
        }
    }
}
