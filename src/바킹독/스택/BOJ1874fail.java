package 바킹독.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * String의 concat메서드 복슴, StringBuilder 언제 사용하는지 복습
 */
public class BOJ1874fail {

    public static void main(String[] args) throws IOException {

        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        int count = 1;

        for (int i = 1; i <= loop; i++) {

            int index = Integer.parseInt(br.readLine());

            while (count <= index) {
                stack.push(count);
                result.append("+\n");
                count++;
            }

            if (stack.peek() == index) {
                stack.pop();
                result.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(result);
    }
}
