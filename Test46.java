import java.util.*;
public class Test46
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=1,i=0;
        for(i=2;i*i<n;i++)
        {
            if(n%i==0)
                cnt+=2;
        }
        if((double)Math.sqrt(n)==(int)Math.sqrt(n))
            cnt++;
    System.out.println(cnt);
    }
}