package 바킹독.기초코드작성요령ll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * BufferedReader, InputStreamReader, StringTokenizer에 대해서 알기
 */
public class BOJ2587fail {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] index = new int[5];
        int sum = 0;

        for (int i = 0; i < index.length; i++) {
            int num = Integer.parseInt(br.readLine());
            index[i] = num;
            sum += num;
        }
        int average = sum / 5;

        Arrays.sort(index);
        int median = index[2];

        System.out.println(average);
        System.out.println(median);
    }
}
