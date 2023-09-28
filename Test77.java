import java.util.Scanner;
public class Test77 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            System.out.println(solve(s));
        }
    }
    public static int solve(String s)
    {
            int n=s.length();
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)==s.charAt(n-i-1))
                {
                    continue;
                }
                else
                {
                    return 0;
                }
            }
            return 1;
    }
}
