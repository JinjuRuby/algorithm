package 바킹독.기초코드작성요령ll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2445 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {

            String stars = "*".repeat(i);
            String blank = " ".repeat(Math.abs(2 * N - (2 * i)));

            System.out.println(stars + blank + stars);
        }

        for (int i = N - 1; i >= 1; i--) {

            String stars = "*".repeat(i);
            String blank = " ".repeat(Math.abs(2 * N - (2 * i)));

            System.out.println(stars + blank + stars);
        }

    }
}
