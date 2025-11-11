package 바킹독.덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ1021 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Deque<Integer> deque = new ArrayDeque<>();
        int[] arr = new int[M];

        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int index = Integer.parseInt(st2.nextToken());
            arr[i] = index;
        }

        int result = 0;
        int count = 0;
        int arrNum = 0;

        while (arrNum < arr.length) {

            count = 0;

            if (deque.peekFirst() == arr[arrNum]) {
                deque.pollFirst();
                arrNum++;
                continue;
            }

            for (Integer index : deque) {
                if (index == arr[arrNum]) {
                    break;
                }
                count++;
            }

            if ((deque.size() / 2) - count >= 0) {
                while (deque.peekFirst() != arr[arrNum]) {
                    Integer index = deque.pollFirst();
                    deque.offerLast(index);
                    result++;
                }
            } else if ((deque.size() / 2) - count < 0) {
                while (deque.peekFirst() != arr[arrNum]) {
                    Integer index = deque.pollLast();
                    deque.offerFirst(index);
                    result++;
                }
            }

        }

        System.out.println(result);
    }
}
