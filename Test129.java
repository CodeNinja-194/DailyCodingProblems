import java.util.Scanner;

public class Test129
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String a=sc.next();
            String b=sc.next();
            int i, yes = 0;
            for(i = 0; i < a.length(); i+=2)
            {
                if(a.charAt(i) == b.charAt(0))
                    yes++;
            }
            System.out.println(yes>0?"YES":"NO");
        }
    }
}