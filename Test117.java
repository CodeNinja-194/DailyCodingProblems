import java.util.Scanner;

public class Test117 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int z=0,o=0;
            String s=sc.next();
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='0')
                {
                    z++;
                }
                else
                {
                    o++;
                }
            }
            if(z!=o)
            {
                System.out.println(Math.min(z,o));
            }
            else
            {
                System.out.println(z-1);
            }
        }
    }
}
