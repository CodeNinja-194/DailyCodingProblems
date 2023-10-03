import java.util.Scanner;

public class Test130 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String s=sc.next();
        int k=0;
        for (int i=0; i<t-2; i++)
            if (s.charAt(i) == 'x' && s.charAt(i+1) == 'x' && s.charAt(i+2) == 'x')
                ++k;
        System.out.println(k);
    }
}
