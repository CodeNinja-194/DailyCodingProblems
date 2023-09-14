import java.util.*;
public class Test30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch;
    int t, n, i, c=0;
    t=sc.nextInt();
    n=sc.nextInt();
    for(i=1; i<=(t*n); i++) {
        ch=sc.next().charAt(0);
        if(ch == 'B' || ch == 'W' || ch == 'G') {
            c++;
        }
    }
    if(c == (t*n)) {
        System.out.println("#Black&White");
    }
    else {
        System.out.println("#Color");
    }
    }
}
