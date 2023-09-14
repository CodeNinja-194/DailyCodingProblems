import java.util.*;
public class Test35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                b[i]=sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0; i < k; i++) 
            {
                if (b[n - 1 - i] > a[i]) 
                {
                    int temp = a[i];
                    a[i] = b[n - 1 - i];
                    b[n - 1 - i] = temp;
                } 
                else 
                {
                    break;
                }
            }
            int sum=0;
            for(int i = 0;i<n;i++)
            {
                sum += a[i];
            }
            System.out.println(sum);
        }
    }
}
