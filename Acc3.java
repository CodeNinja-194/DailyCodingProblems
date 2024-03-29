import java.util.*;
public class Acc3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(solve(s,s.length()));
    }
    public static int solve(String str,int n)
    {
        if(n<4)
        {
            return 0;
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9')
            return 0;
        int num = 0, cap = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '/')
                return 0;
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                cap++;
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                num++;
        }
        if (cap > 0 && num > 0)
            return 1;
        return 0;
    }
}
