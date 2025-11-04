package 바킹독.기초코드작성요령ll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10869 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int fisrtNum = Integer.parseInt(st.nextToken());
        int secondNum = Integer.parseInt(st.nextToken());

        System.out.println(fisrtNum + secondNum);
        System.out.println(fisrtNum - secondNum);
        System.out.println(fisrtNum * secondNum);
        System.out.println(fisrtNum / secondNum);
        System.out.println(fisrtNum % secondNum);

    }
}
