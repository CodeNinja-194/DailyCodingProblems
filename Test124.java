import java.util.Scanner;

public class Test124 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            int c=0;
            for(int i=0,j=n-1; i<n/2; i++,j--)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    break;
                }
                else
                {
                    c++;
                }
            }
            System.out.println(n-2*c);
        }
    }
}
