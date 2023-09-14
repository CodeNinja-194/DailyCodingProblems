

import java.util.*;
public class Roman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            // System.out.println(romantoInt(s));
            long startTime = System.nanoTime(); // Start measuring execution time
            int result = romantoInt(s);
            long endTime = System.nanoTime(); // End measuring execution time

            System.out.println("Result: " + result);
            long executionTime = endTime - startTime;
            double executionTimeInMillis = (double) executionTime / 1_000_000; // Convert nanoseconds to milliseconds
            System.out.println("Execution Time: " + executionTimeInMillis + " milliseconds");

        }
    }
    public static int romantoInt(String s)
    {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int ans = 0, prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int num = romanMap.get(s.charAt(i));
            if (num < prevValue) {
                ans -= num;
            } else {
                ans += num;
            }
            prevValue = num;
        }
        return ans;
    }
}

