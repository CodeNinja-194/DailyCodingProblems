import java.util.Scanner;

public class Test115 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long two,three, five,six;
        two=sc.nextLong();
        three=sc.nextLong();
        five=sc.nextLong();
        six=sc.nextLong();
        long s1,s2;
        s1 =Math.min(Math.min(two,five),six);
        two-=s1;
        five-=s1;
        six-=s1;
        s2= Math.min(three,two);
        long ans= 256 *s1 + 32 * s2 ;
        System.out.println(ans);
    }
}
