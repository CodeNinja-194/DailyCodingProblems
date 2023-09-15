import java.util.Arrays;

public class Test64 {
    public static void main(String[] args) {
        int[] inputNumbers = {100,1,839,1836,610,757};

        // Step 1: Subtract each digit from 5 and take the absolute value if negative
        int[] resultNumbers = new int[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            int num = inputNumbers[i];
            int result = 0;

            while (num > 0) {
                int digit = num % 10;
                int newDigit = 5 - digit;
                if (newDigit < 0) {
                    newDigit = -newDigit; // Take the absolute value
                }
                result = result * 10 + newDigit;
                num /= 10;
            }

            resultNumbers[i] = result;
        }

        System.out.println("Input Numbers: " + Arrays.toString(inputNumbers));
        System.out.println("Resultant Numbers after Step 1: " + Arrays.toString(resultNumbers));

        // Step 2: Reduce each number to a single digit using continuous digit sum
        int[] singleDigitResult = new int[resultNumbers.length];
        for (int i = 0; i < resultNumbers.length; i++) {
            int num = resultNumbers[i];
            while (num >= 10) {
                int digitSum = 0;
                while (num > 0) {
                    digitSum += num % 10;
                    num /= 10;
                }
                num = digitSum;
            }
            singleDigitResult[i] = num;
        }

        System.out.println("Resultant Array after Step 2: " + Arrays.toString(singleDigitResult));

        // Step 3: Sum the elements of the single-digit result array
        int finalResult = 0;
        for (int num : singleDigitResult) {
            finalResult += num;
        }

        System.out.println("Final Result: " + finalResult);
    }
}
