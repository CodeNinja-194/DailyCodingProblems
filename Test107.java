import java.util.Scanner;

public class Test107 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int k = 3;
        String t="";
        
        if(n >= 2){
            t += s.charAt(0);
            t += s.charAt(1);
        }
        else{
            t += s.charAt(0);
        }
        for(int i=3; i<n;)
        {
            t += s.charAt(i);
            i += k;
            k++;
        }
        System.out.println(t);
    }
}
