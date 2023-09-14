import java.util.*;
import java.util.Stack;
public class Test47 {

    public static void main(String[] args) {
        String input = "{\"name\":\"John\", \"email\":\"john.d@gmail.com\"}";
        String formattedJson = formatJson(input);
        System.out.println(formattedJson);
    }

    public static String formatJson(String input) {
        StringBuilder output = new StringBuilder();
        int indentLevel = 0;
        boolean inQuotes = false;

        for (char c : input.toCharArray()) {
            if (c == '{' || c == '[') {
                output.append(c);
                indentLevel++;
            } else if (c == '}' || c == ']') {
                indentLevel--;
                output.append(c);
            } else if (c == '"') {
                inQuotes = !inQuotes;
                output.append(c);
            } else if (c == ',') {
                output.append(c);
                if (!inQuotes) {
                    appendIndentation(output, indentLevel);
                }
            } else {
                output.append(c);
            }
        }

        return output.toString();
    }

    private static void appendIndentation(StringBuilder builder, int level) {
        for (int i = 0; i < level; i++) {
            builder.append("**");
        }
    }
}
