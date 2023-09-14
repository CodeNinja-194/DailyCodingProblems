import java.util.*;
public class Acc1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int units=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(solve(r,units,n,a));
    }
    public static int solve(int r,int u,int n,int[] a)
    {
        int res=r*u;
        if(a==null)
        {
            return -1;
        }
        int sum=0,c=0;
        for (int i = 0; i < n; i++) 
        {
            sum = sum + a[i];
            c++;
            if (sum >= res)
                break;
        }
        if (sum < res)
            return 0;
        return c;
    }
}
