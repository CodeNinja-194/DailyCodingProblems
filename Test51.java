import java.util.*;
public class Test51 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            int x=0,y=0,ct=0;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='U')
                {
                    y++;
                }
                if(s.charAt(i)=='D')
                {
                    y--;
                }
                if(s.charAt(i)=='R')
                {
                    x++;
                }
                if(s.charAt(i)=='L')
                {
                    x--;
                }
                if(x==1 && y==1)
                {
                    ct=1;
                    break;
                }
            }
            System.out.println((ct==1)?"YES":"NO");
        }
    }
}