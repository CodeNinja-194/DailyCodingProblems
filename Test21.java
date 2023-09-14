import java.util.*;
public class Test21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=1;
        while(t-->0)
        {
            String s=sc.next();
            int cnt = 0, maxi = 0;
            for (char ch : s.toCharArray()) {
                if (ch == '(') {
                    ++cnt;
                    maxi = Math.max(cnt, maxi);
                } else if (ch == ')') {
                    cnt--;
                }
            }
            System.out.println(maxi);
        }
    }
}