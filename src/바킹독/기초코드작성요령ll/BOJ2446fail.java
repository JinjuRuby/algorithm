package 바킹독.기초코드작성요령ll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 이런 문제에 익숙해지기
 */
public class BOJ2446fail {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {

            String blank = " ".repeat(i);
            String stars = "*".repeat(((2 * N) - 1) - (2 * i));

            System.out.println(blank + stars);
        }

        for (int i = N - 2; i >= 0; i--) {
            String blank = " ".repeat(i);
            String stars = "*".repeat(((2 * N) - 1) - (2 * i));

            System.out.println(blank + stars);
        }
    }
}
