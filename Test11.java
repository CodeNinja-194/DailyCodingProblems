import java.io.*;
import java.util.*;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] people = new int[n];
        int[] igloo = new int[n];
        
        for (int i = 0; i < n; i++) 
        {
            people[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            igloo[i] = sc.nextInt();
        }
        
        // Sort both arrays
        Arrays.sort(people);
        Arrays.sort(igloo);
        
        long totalmins = 0;
        
        for (int i = 0; i < n; i++) 
        {
            totalmins = Math.max(Math.abs(people[i] - igloo[i]),totalmins);
        }
        
        System.out.println(totalmins);
        
        sc.close();
    }
}
