import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 8, 9, 6, 7, 11, 13, 15, 16, 18, 19, 31, 33, 37, 45};
        int val = 0;
        int sum = 0;
        int min = arr[0];

        // Loop through the array to find prime numbers
        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;
            
            if (arr[i] <= 1) {
                isPrime = false; // 1 is not a prime number
            } else {
                for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                    if (arr[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(arr[i] + " is a prime number in the array ");
                // Find the minimum prime number
                if (min > arr[i]) {
                    min = arr[i];
                    System.out.println("Min " + min);
                }
                val += arr[i]; // Sum the prime numbers
            }
        }

        // System.out.println("Min " + min);
        sum = val - min; // Calculate the sum minus the minimum prime
        System.out.println("Sum " + sum);
    }
}
