import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test109 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            Set<String> res=new HashSet<>();
            for(int i=0;i<n-1;i++)
            {
                String sk = "";
                sk+=s.charAt(i);
                sk+=s.charAt(i+1);
                res.add(sk);
            }
            System.out.println(res.size());
        }
    }
}
