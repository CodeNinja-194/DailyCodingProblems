import java.util.*;
public class Test25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int s1,s2,s3,s4;
            s1=sc.nextInt();
            s2=sc.nextInt();
            s3=sc.nextInt();
            s4=sc.nextInt();
            int win1 = Math.max(s1,s2);
            int loss1 = Math.min(s1,s2);
            int win2 = Math.max(s3,s4);
            int loss2 =Math.min(s3,s4);
            if (loss1<=win2 && loss2<=win1){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}