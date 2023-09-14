import java.util.*;
public class Test44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int maxi=0,cnt=0;
            for(int i=0;i<n;i++)
            {
                if(a[i] == 0)
                {
                    cnt++;
                }
                else
                {
                    maxi =Math.max(maxi, cnt);
                    cnt = 0;
                }
            }
            System.out.println(Math.max(maxi,cnt));
            // System.out.println(maxi);
        }
    }
}
