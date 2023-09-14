import java.util.Scanner;

public class Test50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        for (int i = 0; i < N; i++) {
            String email = scanner.nextLine();
            boolean isValid = isValidEmail(email);
            System.out.println(isValid);
        }
    }

    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        
        // Split the email by "@" to check the basic structure
        String[] parts = email.split("@");
        if (parts.length != 2) {
            return false;
        }
        
        String localPart = parts[0];
        String domainPart = parts[1];
        
        // Check the local part and domain part for validity
        if (!isValidLocalPart(localPart) || !isValidDomainPart(domainPart)) {
            return false;
        }
        
        return true;
    }

    public static boolean isValidLocalPart(String localPart) {
        // Check if the local part is not empty and doesn't contain spaces
        return !localPart.isEmpty() && !localPart.contains(" ");
    }

    public static boolean isValidDomainPart(String domainPart) {
        // Check if the domain part is not empty and doesn't contain spaces
        return !domainPart.isEmpty() && !domainPart.contains(" ");
    }
}
