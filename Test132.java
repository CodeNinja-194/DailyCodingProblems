import java.util.Scanner;

public class Test132 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int  cnt=0, x=0, y=0;
        int n=s.length();
        for(int i=0; i<n ;i++)
        {
            if(s.charAt(i)=='Q')
            {
                cnt+=x;
                y++;
            }
            else if(s.charAt(i)=='A')
            {
                x+=y;
            }
        }
        System.out.println(cnt);
    }
}
