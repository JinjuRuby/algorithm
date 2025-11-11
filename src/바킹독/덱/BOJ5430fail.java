package 바킹독.덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

/**
 * split 할 때 빈 배열이 들어갈 경우 어떻게 해야하는지 생각하기
 */
public class BOJ5430fail {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String p = br.readLine();
            String[] arrP = p.split("");

            int n = Integer.parseInt(br.readLine());

            String x = br.readLine();
            String substring = x.substring(1, x.length() - 1);
            String[] split = substring.split(",");

            ArrayDeque<Integer> deque = new ArrayDeque<>();
            boolean isError = false;

            StringBuilder sb = new StringBuilder();


            if (n > 0) {
                for (String s : split) {
                    if (!s.isEmpty()) {
                        deque.offer(Integer.parseInt(s));
                    }
                }
            }

            boolean isReverse = false;
            for (String s : arrP) {
                if (s.equals("R")) {

                    isReverse = !isReverse;

                } else if (s.equals("D")) {

                    if (deque.isEmpty()) {
                        sb.append("error");
                        isError = true;
                        break;
                    }

                    if (!isReverse) {
                        deque.pollFirst();
                    } else {
                        deque.pollLast();
                    }
                }
            }

            int size = deque.size();

            if (!isError) {
                sb.append("[");
                for (int j = 0; j < size; j++) {
                    if (!isReverse) {
                        sb.append(deque.pollFirst());
                    } else {
                        sb.append(deque.pollLast());
                    }
                    if (j != size - 1) {
                        sb.append(",");
                    }
                }
                sb.append("]");
            }

            System.out.println(sb);
        }

    }
}
