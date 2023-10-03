import java.util.Scanner;

public class Test142 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for (int j = 0; j < n / 2; ++j)
            {
            System.out.print(a[j]+" "+a[n-j-1]+" ");
            }
            if (n%2!=0)
            {
                System.out.print(a[n/2]);
            }
            System.out.println();
        }
    }
}
