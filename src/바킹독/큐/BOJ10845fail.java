package 바킹독.큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BOJ10845fail {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String order = st.nextToken();

            //st.hasMoreTokens 사용해보기
            if (st.hasMoreTokens()) {

                if (order.equals("push")) {
                    deque.offer(Integer.parseInt(st.nextToken()));
                }
            } else {

                if (order.equals("front")) {

                    Integer peekFirst = deque.peekFirst();

                    if (peekFirst == null) {

                        sb.append("-1\n");
                    } else {

                        sb.append(peekFirst).append("\n");
                    }
                } else if (order.equals("back")) {

                    Integer peekLast = deque.peekLast();

                    if (peekLast == null) {

                        sb.append("-1\n");
                    } else {

                        sb.append(peekLast).append("\n");
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

                    Integer pop = deque.poll();

                    if (pop == null) {

                        sb.append("-1\n");
                    } else {

                        sb.append(pop).append("\n");
                    }
                }
            }
        }

        System.out.println(sb);

    }
}
