import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test141
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading t

        while(t-->0)
        {
            String s = sc.nextLine();
            Set<Character> repeated = new HashSet<>();
            Set<Character> nonRepeated = new HashSet<>();
            int ans = 0;
            for (int i = 0; i < s.length(); i++)
            {
                if (nonRepeated.contains(s.charAt(i)))
                {
                    ans++;
                    nonRepeated.remove(s.charAt(i));
                    repeated.add(s.charAt(i));
                }
                else if (!repeated.contains(s.charAt(i)))
                {
                    nonRepeated.add(s.charAt(i));
                }
            }
            ans += nonRepeated.size() / 2; 
            System.out.println(ans);
        }
    }
}
