import java.util.Scanner;

public class Test133 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long q=sc.nextLong();
            long ans=0,d=0;
            if(q%2==1)
            {
                d=(q/2)+1;
            }
            else
            {
                d=q/2;
            }
            ans=(d*a)-((q-d)*b);
            System.out.println(ans);
        }
    }
}
