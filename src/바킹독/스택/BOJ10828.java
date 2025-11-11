package 바킹독.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10828 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int order = Integer.parseInt(br.readLine());

        int[] stack = new int[100001];
        int pos = 0;

        for (int i = 0; i < order; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String string = st.nextToken();
            if (string.equals("top")) {
                if (pos == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack[pos - 1]);
                }
            } else if (string.equals("size")) {
                System.out.println(pos);
            } else if (string.equals("empty")) {
                if (pos == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (string.equals("pop")) {
                if (pos == 0) {
                    System.out.println(-1);
                } else {
                    pos--;
                    System.out.println(stack[pos]);
                }
            } else if (string.equals("push")) {
                int index = Integer.parseInt(st.nextToken());
                stack[pos] = index;
                pos++;
            } else {
                System.out.println("Wrong word");
            }


        }

    }
}
