import java.util.Scanner;
public class Test67 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int one=0,sum=0,div=0;
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]==1)
                {
                    one++;
                    sum++;
                }
                else
                {
                    sum+=2;
                }
            }
            if(sum%2==0)
            {
                div=sum/2;
                if(div%2==0)
                {
                    System.out.println("YES");
                }
                else
                {
                    if(one>0)
                    {
                        System.out.println("YES");
                    }
                    else
                    {
                        System.out.println("NO");
                    }
                }
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
