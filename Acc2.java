import java.util.*;
public class Acc2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(solve(s));
    }
    public static int solve(String str)
    {
        int n =str.length();
        int res = str.charAt(0) - '0';
        for (int i = 1; i<n;) 
        {
            char prev = str.charAt(i);
            i++;
            if (prev == 'A')
                res = res & (str.charAt(i) - '0');
            else if (prev == 'B')
                res = res | (str.charAt(i) - '0');
            else
                res = res ^ (str.charAt(i) - '0');
            i++;
        }
        return res;
    }
}
