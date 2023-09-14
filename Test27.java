import java.util.Scanner;

public class Test27 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    sc.close();
    StringBuilder sb = new StringBuilder();
    int n = s.length();
    for (int i = 0; i < n; i++) {
        char ch = s.charAt(i);
        if (Character.isUpperCase(ch)) {
            int index = 'Z' - ch + 'A';
            sb.append((char) index);
        } else {
            int index = 'z' - ch + 'a';
            sb.append((char) index);
        }

    }
    System.out.println(sb.toString());
    } 
}
