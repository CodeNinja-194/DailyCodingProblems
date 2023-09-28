import java.util.Scanner;
public class Test76 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int r=0,g=0,b=0,no=0;
            String s=sc.next();
            for(int i = 0; i < 6; i++)
            {
                if(s.charAt(i) == 'r')
                    r++;
                if(s.charAt(i) == 'g')
                    g++;
                if(s.charAt(i) == 'b')
                    b++;
                if(s.charAt(i) == 'R' && r == 0)
                {
                    no++;
                }
                if(s.charAt(i) == 'G' && g == 0)
                {
                    no++;
                }
                if(s.charAt(i) == 'B' && b == 0)
                {
                    no++;
                }
            }
            System.out.println(no>0?"NO":"YES");
        }
    }
}
