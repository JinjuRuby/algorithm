package 바킹독.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ3273fail {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] stArr = new int[n];


        for (int i = 0; i < n; i++) {
            stArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(stArr);

        int x = Integer.parseInt(br.readLine());

        int left = 0;
        int right = n - 1;
        int result = 0;

        while (left < right) {
            int currentSum = stArr[left] + stArr[right];
            if (currentSum == x) {
                result++;

                left++;
                right--;
            } else if (currentSum < x) {
                left++;
            } else if (currentSum > x) {
                right--;
            }
        }

        System.out.println(result);

    }
}
