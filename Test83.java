import java.util.Scanner;
public class Test83 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d1=sc.nextInt();
        int d2=sc.nextInt();
        int d3=sc.nextInt();
        int a2=0,a1=0,a3=0,a4=0,ans=0;
        int n=3;
        while(n-->0)
        {
        a1=d1+d2+d3;
        a2=2*d1+2*d2;
        a3=2*d1+2*d3;
        a4=2*d2+2*d3;
        ans=Math.min(a1,Math.min(a2,Math.min(a3,a4)));
        System.out.println(ans);
        break;
        }
    }
}
