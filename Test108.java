import java.util.Arrays;
import java.util.Scanner;

public class Test108 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            String s=sc.next();
            int t=s.length();
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            System.out.println(new String(ch));
        }
    }
}
