package 바킹독.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1475fail {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String stringNum = String.valueOf(N);
        int[] digits = new int[9];
        for (int i = 0; i < stringNum.length(); i++) {
            int index = Character.getNumericValue(stringNum.charAt(i));
            if (index == 9) {
                index = 6;
            }
            digits[index]++;
        }

        digits[6] = (digits[6] + 1) / 2;

        int max =  digits[0];
        for (int digit : digits) {
            if (max < digit) {
                max = digit;
            }
        }

        System.out.println(max);
    }
}
