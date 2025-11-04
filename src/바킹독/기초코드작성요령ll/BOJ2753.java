package 바킹독.기초코드작성요령ll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2753 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int index = Integer.parseInt(st.nextToken());

        if (index % 400 == 0) {
            System.out.println(1);
        } else if (index % 4 == 0 && index % 100 != 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
