import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test116 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            Set<Integer> res=new HashSet<>();
            for(int i:a)
            {
                if(!res.contains(i))
                {
                    res.add(i);
                }
            }
            System.out.println(res.size());
        }
    }
}
