import java.util.Arrays;
import java.util.Scanner;
class Test70 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
            }
            // long[] b = Arrays.copyOf(a, n);
            Long[] b=new Long[n];
            for(int i=0;i<n;i++)
            {
                b[i]=a[i];
            }
            Arrays.sort(b);
            long max=b[n-1];
            for(long num:a)
            {
                if (num == max)
                {
                    System.out.print(num - b[n - 2] + " ");
                }
                else
                {
                    System.out.print(num - max + " ");
                }
            }
            System.out.println("");
        }
    }
}