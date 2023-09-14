import java.util.*;

public class Test43
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            String str[]=s.split("\\+", 2);
            System.out.println(Integer.parseInt(str[0])+Integer.parseInt(str[1]));
        }
    }
}