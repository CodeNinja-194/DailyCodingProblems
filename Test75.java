import java.util.Scanner;
public class Test75 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=n; i>0; i--)
            {
                a[i]=i;
            }
            for(int i=1; i<n; i++)
            {
                if(a[i] <= i+1)
                {
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
            // for(int i=0;i<n;i++)
            // {
            //     System.out.print(a[i]+" ");
            // }
            System.out.println();
        }
    }
}
