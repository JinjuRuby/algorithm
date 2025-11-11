package 바킹독.수식의괄호쌍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ4949fail {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {

            String line = br.readLine();

            if (line.equals(".")) {
                break;
            }

            sb.append(isCorrect(line)).append("\n");

        }

        System.out.println(sb);
    }

    private static String isCorrect(String line) {

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c == '(' || c == '[') {

                deque.offer(c);

            } else if (c == ')') {

                if (deque.peekLast() == null || deque.peekLast() != '(') {
                    return "no";
                }
                deque.pollLast();

            } else if (c == ']') {

                if (deque.peekLast() == null || deque.peekLast() != '[') {
                    return "no";
                }
                deque.pollLast();

            }

        }

        if (deque.isEmpty()) {
            return "yes";
        } else {
            return "no";
        }

    }
}
