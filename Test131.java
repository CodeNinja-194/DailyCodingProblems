import java.util.Scanner;

public class Test131
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            String res="";
            for(int i=0;i<n;i++)
            {
                if(i+2<n && s.charAt(i+2)=='0' && (i+3>=n || s.charAt(i+3)!='0'))
                {
                    int num=((s.charAt(i)-'0')*10)+(s.charAt(i+1)-'0');
                    res+=(char)(96+num);
                    i+=2;
                }
                else
                {
                    int num=((s.charAt(i)-'0'));
                    res+=(char)(96+num);
                }
            }
            System.out.println(res);
        }
    }
}
