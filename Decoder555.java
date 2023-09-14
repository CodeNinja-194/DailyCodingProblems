public class Decoder555 {
    public static int decodeAndFindResult(int[] input, int input2) {
        int[] step1Result = new int[input2];
        int[] step2Result = new int[input2];
        int finalResult = 0;

        // Step 1: Subtract each digit from 5 and perform continuous digit sum
        for (int i = 0; i < input2; i++) {
            int num = input[i];
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                int result = 5 - digit;
                sum += result >= 0 ? result : -result;
                num /= 10;
            }

            step1Result[i] = sum;
        }

        // Step 2: Perform continuous digit sum on each number from Step 1
        for (int i = 0; i < input2; i++) {
            int num = step1Result[i];

            while (num >= 10) {
                int sum = 0;
                while (num > 0) {
                    int digit = num % 10;
                    sum += digit;
                    num /= 10;
                }
                num = sum;
            }

            step2Result[i] = num;
        }

        // Step 3: Calculate the final result by adding all elements from Step 2
        for (int i = 0; i < input2; i++) {
            finalResult += step2Result[i];
        }

        return finalResult;
    }

    public static void main(String[] args) {
        int[] input1 = {179, 281, 379, 218, 610};
        int input2 = 5;
        int result1 = decodeAndFindResult(input1, input2);
        System.out.println("The final expected result for Example 1: " + result1); // Output: 12

        int[] input2Arr = {100, 1, 839, 1836, 610, 757};
        int input2Size = 6;
        int result2 = decodeAndFindResult(input2Arr, input2Size);
        System.out.println("The final expected result for Example 2: " + result2); // Output: 19
    }
}