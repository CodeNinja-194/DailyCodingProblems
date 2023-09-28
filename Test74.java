import java.util.HashSet;
import java.util.Scanner;
public class Test74 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        while (t-- > 0)
        {
            set.clear();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                set.add(sc.nextInt());
            }
            System.out.println(set.size() == n? "YES":"NO");
        }
    }
}
