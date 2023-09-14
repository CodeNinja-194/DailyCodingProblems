import java.util.*;
public class Test56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next().toLowerCase();
            String res="meow";
            StringBuilder uniqueS = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (uniqueS.indexOf(String.valueOf(c)) == -1) {
                    uniqueS.append(c);
                }
            }
            if (uniqueS.toString().equals(res)) 
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
