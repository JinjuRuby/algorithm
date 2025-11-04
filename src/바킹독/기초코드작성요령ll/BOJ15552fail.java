package 바킹독.기초코드작성요령ll;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 최적화 방법 알기
 */
public class BOJ15552fail {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            StringTokenizer inputSt = new StringTokenizer(br.readLine(), " ");
            bw.write(String.valueOf(((Integer.parseInt(inputSt.nextToken())) + (Integer.parseInt(inputSt.nextToken())))));
            bw.newLine();
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
