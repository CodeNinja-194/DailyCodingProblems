import java.util.Scanner;

public class Test127 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int c=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]%2!=0)
                {
                    c++;
                }
            }
            System.out.println((c%2==0)?"YES":"NO");
        }
    }
}
