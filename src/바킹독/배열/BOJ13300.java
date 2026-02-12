package 바킹독.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ13300 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int students = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int total = 0;

        int[][] student = new int[2][7];

        for (int i = 0; i < students; i++) {

            StringTokenizer st1 = new StringTokenizer(br.readLine());

            int sex = Integer.parseInt(st1.nextToken());
            int grade = Integer.parseInt(st1.nextToken());

            student[sex][grade]++;
        }

        for (int[] ints : student) {
            for (int count : ints) {
                total += (int) Math.ceil(count / (double) k);
            }
        }

        System.out.println(total);

    }
}
