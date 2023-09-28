import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test88 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tt = Integer.parseInt(br.readLine());

        while (tt-- > 0) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int len = Integer.parseInt(input[1]);
            String s = br.readLine();

            int op = 0;
            int pos = 0;

            while (pos < n) {
                if (s.charAt(pos) == 'W') {
                    pos++;
                } else {
                    op++;
                    pos += len;
                }
            }

            System.out.println(op);
        }
    }
}
