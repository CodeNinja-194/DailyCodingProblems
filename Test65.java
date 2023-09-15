public class Test65 {
    public static void main(String[] args) {
        int input1 = 1274;
        int input2 = 5283;
        int input3 = 1937;
        
        int thousands = findSmallestDigit(input1, input2, input3);
        int hundreds = findLargestDigit(input1, input2, input3);
        int tens = findMinFrequencyDigit(input1, input2, input3);
        int units = findMaxFrequencyDigit(input1, input2, input3);
        
        int pin = thousands * 1000 + hundreds * 100 + tens * 10 + units;
        
        System.out.println("Generated PIN: " + pin);
    }
    
    // Function to find the smallest digit
    static int findSmallestDigit(int num1, int num2, int num3) {
        int smallest = Integer.MAX_VALUE; // Initialize smallest to the maximum possible value
    
    int[] nums = {num1, num2, num3}; // Store the numbers in an array

    for (int num : nums) {
        while (num > 0) {
            int digit = num % 10;
            smallest = Math.min(smallest, digit);
            num /= 10;
        }
    }

    return smallest;
    }
    
    // Function to find the largest digit
    static int findLargestDigit(int num1, int num2, int num3) {
        int largest = 0;
        
        int[] nums = {num1, num2, num3}; // Store the numbers in an array

        for (int num : nums) {
            while (num > 0) {
                int digit = num % 10;
                largest = Math.max(largest, digit);
                num /= 10;
            }
        }

        return largest;
    }
    
    // Function to find the digit with minimum frequency
    static int findMinFrequencyDigit(int num1, int num2, int num3) {
    int[] freq = new int[10];
    
    while (num1 > 0) {
        int digit = num1 % 10;
        freq[digit]++;
        num1 /= 10;
    }
    
    while (num2 > 0) {
        int digit = num2 % 10;
        freq[digit]++;
        num2 /= 10;
    }
    
    while (num3 > 0) {
        int digit = num3 % 10;
        freq[digit]++;
        num3 /= 10;
    }
    
    int minFrequencyDigit = -1;
    int minFrequency = Integer.MAX_VALUE;
    
    for (int i = 0; i < 10; i++) {
        if (freq[i] < minFrequency && freq[i] > 0) {
            minFrequency = freq[i];
            minFrequencyDigit = i;
        }
    }
    
    return minFrequencyDigit;
}

    
    // Function to find the digit with maximum frequency
    static int findMaxFrequencyDigit(int num1, int num2, int num3) {
    int[] freq = new int[10];
    
    while (num1 > 0) {
        int digit = num1 % 10;
        freq[digit]++;
        num1 /= 10;
    }
    
    while (num2 > 0) {
        int digit = num2 % 10;
        freq[digit]++;
        num2 /= 10;
    }
    
    while (num3 > 0) {
        int digit = num3 % 10;
        freq[digit]++;
        num3 /= 10;
    }
    
    int maxFrequencyDigit = -1;
    int maxFrequency = -1;
    
    int minFrequencyDigit = -1;
    int minFrequency = Integer.MAX_VALUE;
    
    for (int i = 0; i < 10; i++) {
        if (freq[i] > maxFrequency) {
            maxFrequency = freq[i];
            maxFrequencyDigit = i;
        }
        
        if (freq[i] < minFrequency && freq[i] > 0) {
            minFrequency = freq[i];
            minFrequencyDigit = i;
        }
    }
    
    return minFrequencyDigit;
    }
}
