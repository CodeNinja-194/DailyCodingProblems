public class Test63 {
    public static void main(String[] args) {
        int[] input1 = {5,41,99,125,678,367};
        int input2 = 6;

        // Step 1: Subtract each digit from 5 and take the absolute value if negative
        int[] resultNumbers = new int[input2];
        for (int i = 0; i < input2; i++) {
            int num = input1[i];
            int result = 0;

            if (num >= 100 && num <= 999) {
                while (num > 0) {
                    int digit = num % 10;
                    int newDigit = 5 - digit;
                    if (newDigit < 0) {
                        newDigit = -newDigit; // Take the absolute value
                    }
                    result = result * 10 + newDigit;
                    num /= 10;
                }
            }

            resultNumbers[i] = result;
        }

        // Step 2: Reduce each number to a single digit using continuous digit sum
        int[] singleDigitResult = new int[input2];
        for (int i = 0; i < input2; i++) {
            int num = resultNumbers[i];
            while (num >= 10) {
                int digitSum = 0;
                while (num > 0) {
                    digitSum += num % 10;
                    num /= 10;
                }
                num = digitSum;
            }
            num=solve(num);
            singleDigitResult[i] = num;
        }
      

        // Step 3: Sum the elements of the single-digit result array
        int finalResult = 0;
        for (int num : singleDigitResult) {
            finalResult += num;
        }
        System.out.println("Final Result: " + finalResult);
    }
    public static int solve(int num)
        {
            while (num >= 10) {
                int digitSum = 0;
                while (num > 0) {
                    digitSum += num % 10;
                    num /= 10;
                }
                num = digitSum;
            }
            return num;
        }
}
