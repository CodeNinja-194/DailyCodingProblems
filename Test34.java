import java.util.*;
public class Test34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int mini=Integer.MAX_VALUE,sum=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                mini=Math.min(mini,a[i]);
            }
            // sc.close();
            for(int i=0;i<n;i++)
            {
                sum+=a[i]-mini;
            }
            System.out.println(sum);
        }
    }
}
