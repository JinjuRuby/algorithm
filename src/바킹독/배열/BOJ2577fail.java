package 바킹독.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * int 변수을 각 자리수 int 배열로 만드는 방법 알기(+ int 변수를 String으로 만드는 방법, String을 int 배열로 만드는 방법 알기)
 */
public class BOJ2577fail {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 1;

        for (int i = 0; i < 3; i++) {
            num *= Integer.parseInt(br.readLine());
        }

        String stringNum = String.valueOf(num);

        int[] digits = new int[stringNum.length()];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = Character.getNumericValue(stringNum.charAt(i));
        }

        int[] result = new int[10];
        for (int i = 0; i < digits.length; i++) {
            result[digits[i]] += 1;
        }

        for (int i : result) {
            System.out.println(i);
        }


    }
}
