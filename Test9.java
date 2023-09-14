import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        sc.close();
        System.out.println(len1(str));
    }
    public static int len1(String s)
    {
        int c=0;
        String res="SOSSOS";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=res.charAt(i%3))
            {
                c++;
            }
        }
        return c;
    }
}
