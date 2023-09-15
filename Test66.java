import java.util.Scanner;

public class Test66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three 4-digit numbers
        System.out.print("Enter the first 4-digit number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second 4-digit number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third 4-digit number: ");
        int number3 = scanner.nextInt();

        // Find the smallest digit among the three numbers
        int smallestDigit = findSmallestDigit(number1, number2, number3);

        // Display the result
        System.out.println("The smallest digit among the three numbers is: " + smallestDigit);

        scanner.close();
    }

    // Function to find the smallest digit among three numbers
    public static int findSmallestDigit(int num1, int num2, int num3) {
        int smallest = 9; // Initialize smallest to the largest possible digit

        // Loop through each digit of the three numbers
        while (num1 > 0 || num2 > 0 || num3 > 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            int digit3 = num3 % 10;

            // Check if any of the digits is smaller than the current smallest
            if (digit1 < smallest) {
                smallest = digit1;
            }
            if (digit2 < smallest) {
                smallest = digit2;
            }
            if (digit3 < smallest) {
                smallest = digit3;
            }

            // Remove the last digit from each number
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
        }

        return smallest;
    }
}
