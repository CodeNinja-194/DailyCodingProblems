import java.util.*;
public class Test54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            int n=s.length();
            int a=0,b=0,c=0;
            for(int i=0;i<n;i++)
            {
                char ch=s.charAt(i);
                if(ch=='A')
                    a++;
                else if(ch=='B')
                    b++;
                else
                    c++;
            }
            System.out.println((a+c==b)?"YES":"NO");
        }
    }
}
