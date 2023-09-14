import java.util.*;
public class Test10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        sc.close();
        boolean flag=true;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                flag=false;
            }
        }
        System.out.println(flag?"true":"false");
    }
}
