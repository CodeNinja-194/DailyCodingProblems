import java.util.*;
public class Test33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int n=sc.nextInt();
            int sum=0;
            sum+=a+b+c+n;
            if(sum%3!=0 || sum/3<a || sum/3<b || sum/3<c)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
