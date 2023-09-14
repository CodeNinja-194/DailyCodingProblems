import java.util.*;
public class Test14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int ans=0;
        int prev=-1;
        for (int i = 0; i < n; i++) 
        {
            int buttons = a[i] / p;
            if (buttons * p == a[i]) 
            {
                if (buttons <= prev)
                {
                    ans = ans + prev + 1;
                    prev++;
                } 
                else 
                {
                    ans = ans + buttons;
                    prev = buttons;
                }
            } 
            else 
            {
                buttons++;
                if (buttons <= prev) 
                {
                    ans = ans + prev + 1;
                    prev++;
                } 
                else 
                {
                    ans = ans + buttons;
                    prev = buttons;
                }
            }
        }
        System.out.println(ans);
    }
}
