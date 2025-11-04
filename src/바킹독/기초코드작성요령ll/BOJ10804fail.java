package 바킹독.기초코드작성요령ll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 문제 잘 읽기
 */
public class BOJ10804fail {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[20];
        for (int i = 1; i <= nums.length; i++) {
            nums[i - 1] = i;
        }

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            for (int j = 0; j < (to - from + 1) / 2; j++) {
                int temp = nums[(from - 1) + j];
                nums[(from - 1) + j] = nums[(to - 1) - j];
                nums[(to - 1) - j] = temp;
            }
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
