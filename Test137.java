import java.util.ArrayList;
import java.util.Scanner;

public class Test137
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[m];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int j=0;j<m;j++)
            {
                b[j]=sc.nextInt();
            }
            ArrayList<Integer>res=new ArrayList<Integer>();
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<m; j++)
                {
                    if(a[i] == b[j])
                    {
                        res.add(a[i]);
                        break;
                    }
                }
                    if(res.size() == 1)
                    {
                        break;
                    }
            }
            if(res.size() == 0)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
                System.out.print(res.size()+" ");
                for(int i=0; i<res.size(); i++)
                {
                    System.out.println(res.get(i));
                }
            }
        }
    }
}
