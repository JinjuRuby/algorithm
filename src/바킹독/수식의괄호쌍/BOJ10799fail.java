package 바킹독.수식의괄호쌍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ10799fail {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        Deque<Character> stack = new ArrayDeque<>();
        int total = 0;

        for (int i = 0; i < line.length(); i++) {

            char c = line.charAt(i);

            if (c == '(') {
                stack.offer('(');
            } else if (c == ')') {
                stack.pollLast();

                if (line.charAt(i - 1) == '(') {
                    total += stack.size();
                } else {
                    total++;
                }
            }
        }

        System.out.println(total);

    }

}

