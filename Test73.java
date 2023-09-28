import java.util.Scanner;
public class Test73 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a=sc.next();
        String b=sc.next();
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans += Math.min(10 - Math.abs(a.charAt(i) - b.charAt(i)), Math.abs(a.charAt(i) - b.charAt(i)));
        }
        System.out.println(ans);
    }
}
