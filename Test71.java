import java.util.Scanner;
public class Test71 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            String res="codeforces";
            int c=0;
            int n=s.length();
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)!=res.charAt(i))
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
