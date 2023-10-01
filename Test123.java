import java.util.Scanner;

public class Test123 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            double A = Math.max(a,b);
            double B = Math.min(a,b);
            int count = 0;
            while(A>B)
            {
                count++;
                double sub = A-B;
                if(sub>=c)
                {
                    A = A-c;
                    B = B+c;
                }
                else
                {
                    double sub2 = (A-B)/2;
                    A = A-sub2;
                    B = B+sub2;
                }
            }
            System.out.println(count);
        }
    }
}
