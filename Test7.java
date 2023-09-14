import java.util.*;
public class Test7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        if (year >= 1919) 
        {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) 
            {
                System.out.println("12.09." + year);
            } 
            else 
            {
                System.out.println("13.0`9." + year);
            }

        } 
        else if (year <= 1917) 
        {
            if (year % 4 == 0) 
            {
                System.out.println("12.09." + year);
            } 
            else 
            {
                System.out.println("13.09." + year);
            }
            
        } 
        else 
        {
            System.out.println("26.09." + year);
        }
    }
}
