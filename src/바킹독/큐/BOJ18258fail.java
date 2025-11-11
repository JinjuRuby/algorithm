package 바킹독.큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ18258fail {

    public static void main(String[] args) throws IOException {

        Deque<Integer> deque = new ArrayDeque<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String order = st.nextToken();

            if (st.hasMoreTokens()) {

                int index = Integer.parseInt(st.nextToken());

                if (order.equals("push")) {
                    deque.offer(index);
                }

            } else {
                if (order.equals("front")) {

                    Integer first = deque.peek();

                    if (first == null) {
                        sb.append("-1\n");
                    } else {
                        sb.append(first).append("\n");
                    }

                } else if (order.equals("back")) {
                    Integer last = deque.peekLast();

                    if (last == null) {
                        sb.append("-1\n");
                    } else {
                        sb.append(last).append("\n");
                    }

                } else if (order.equals("size")) {

                        sb.append(deque.size()).append("\n");

                } else if (order.equals("empty")) {

                    if (deque.isEmpty()) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }

                } else if (order.equals("pop")) {

                    Integer poll = deque.poll();

                    if (poll == null) {
                        sb.append("-1\n");
                    } else {
                        sb.append(poll).append("\n");
                    }

                }
            }
        }

        System.out.println(sb);

    }
}
