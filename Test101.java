import java.util.Scanner;

public class Test101 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        findFrequency(s);
    }

    public static void  findFrequency(String s) {
        for (int i = 0; i < s.length(); i++) {
            // Counting occurrences of s[i]
            int count = 1;
            while (i + 1 < s.length()&& s.charAt(i)== s.charAt(i + 1)) {
                i++;
                count++;
            }
            System.out.print(count);
        }

        System.out.println();
    }
}
