import java.util.Scanner;

public class Test106 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int s=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                s+=a[i];
            }
            System.out.println((int)Math.ceil(s/n));
        }
    }
}
