import java.util.Scanner;
import java.util.Stack;

public class Test100 {
    public static int calculate(String s) {
        Stack<Integer> values = new Stack<>();
        Stack<Character> operators = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isDigit(c)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--; // Move back one position to adjust for loop increment
                values.push(num);
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    evaluate(values, operators);
                }
                operators.pop(); // Pop the '('
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(c)) {
                    evaluate(values, operators);
                }
                operators.push(c);
            }
        }
        
        while (!operators.isEmpty()) {
            evaluate(values, operators);
        }
        
        return values.pop();
    }
    
    private static void evaluate(Stack<Integer> values, Stack<Character> operators) {
        int b = values.pop();
        int a = values.pop();
        char op = operators.pop();
        
        switch (op) {
            case '+':
                values.push(a + b);
                break;
            case '-':
                values.push(a - b);
                break;
            case '*':
                values.push(a * b);
                break;
            case '/':
                values.push(a / b);
                break;
        }
    }
    
    private static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String expression = sc.next();
        int result = calculate(expression);
        System.out.println(result);
    }
}
