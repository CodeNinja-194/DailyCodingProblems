import java.util.*;
public class Test13
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        int t=sc.nextInt();
        int h[]=new int[n];
        for(int i=0;i<n;i++)
        {
            h[i]=sc.nextInt();
        }
        Arrays.sort(h);
        int ans = 0;
        for(int i = 0;i <= n;i ++)
        {
            int ned = h[i] / l;
            if (l * ned < h[i]) ++ ned;
                t -= ned;
                if (t < 0) break;
                ans ++;
        }
        System.out.println(ans);
    }
}

    
