import java.util.*;
public class CountDigit
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countEven(n));
        sc.close();
    }
    
    public static boolean sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return (sum & 1) == 0;
    }

    public static int countEven(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (sumDigits(i)) {
                count++;
            }
        }
        return count;
    }
    
}