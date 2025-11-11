package 바킹독.덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10866 {

    public static void main(String[] args) throws IOException {

        DDeque dDeque = new DDeque();
        StringBuilder sb = new StringBuilder();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String order = st.nextToken();

            if (st.hasMoreTokens()) {
                int index = Integer.parseInt(st.nextToken());

                if (order.equals("push_front")) {
                    dDeque.push_front(index);
                } else if (order.equals("push_back")) {
                    dDeque.push_back(index);
                }

            } else {
                if (order.equals("pop_front")) {

                    int index = dDeque.pop_front();
                    sb.append(index).append("\n");

                } else if (order.equals("pop_back")) {

                    int index = dDeque.pop_back();
                    sb.append(index).append("\n");

                } else if (order.equals("size")) {

                    int size = dDeque.size();
                    sb.append(size).append("\n");

                } else if (order.equals("empty")) {

                    int empty = dDeque.empty();
                    sb.append(empty).append("\n");

                } else if (order.equals("front")) {

                    int front = dDeque.front();
                    sb.append(front).append("\n");

                } else if (order.equals("back")) {
                    int back = dDeque.back();
                    sb.append(back).append("\n");
                }
            }


        }
        System.out.println(sb);

    }

    private static class DDeque {

        private final int[] deque = new int[1000000];
        private int head = deque.length / 2;
        private int tail = deque.length / 2;

        private void push_front(int push) {
            deque[--head] = push;
        }

        private void push_back(int push) {
            deque[tail++] = push;
        }

        private int pop_front() {

            if (size() == 0) {
                return -1;
            }
            return deque[head++];
        }

        private int pop_back() {

            if (size() == 0) {
                return -1;
            }

            return deque[--tail];
        }

        private int size() {
            return tail - head;
        }

        private int empty() {
            if (size() == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        private int front() {
            if (size() == 0) {
                return -1;
            }

            return deque[head];
        }

        private int back() {
            if (size() == 0) {
                return -1;
            }
            return deque[tail - 1];
        }


    }
}
