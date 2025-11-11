package 바킹독.수식의괄호쌍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BOJ3986fail {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i = 0; i < count; i++) {
            String line = br.readLine();
            boolean correct = isCorrect(line);

            if (correct) {
                result++;
            }
        }

        System.out.println(result);
    }

    private static boolean isCorrect(String line) {

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (stack.isEmpty()) {

                stack.offer(c);

            } else {

                if (stack.peekLast() == c) {
                    stack.pollLast();
                } else {
                    stack.offer(c);
                }
            }

        }

        return stack.isEmpty();
    }
}
