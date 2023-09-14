import java.util.*;
public class Test17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            String s = sc.next();
            String res="Timur";
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String str=new String(ch);
            char ch1[]=res.toCharArray();
            Arrays.sort(ch1);
            String str1=new String(ch1);
            if(str.equals(str1))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}