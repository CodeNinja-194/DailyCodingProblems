import java.util.Scanner;

public class Test49{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        String ticketCode = generateTicketCode(N);
        System.out.println(ticketCode);
    }

    public static String generateTicketCode(int N) {
        String ticketCode = "A";
        
        for (int i = 2; i <= N; i++) {
            int count = 1;
            StringBuilder currentCode = new StringBuilder();
            
            for (int j = 0; j < ticketCode.length(); j++) {
                if (j < ticketCode.length() - 1 && ticketCode.charAt(j) == ticketCode.charAt(j + 1)) {
                    count++;
                } else {
                    currentCode.append(count).append(ticketCode.charAt(j));
                    count = 1;
                }
            }
            
            ticketCode = currentCode.toString();
        }
        
        return ticketCode;
    }
}
