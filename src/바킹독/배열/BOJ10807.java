package 바킹독.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10807 {

    public static void main(String[] args) throws IOException {

        int[] arr = new int[201];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());

        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);

        while (st.hasMoreTokens()) {

            int n = Integer.parseInt(st.nextToken());
            arr[100 + n]++;

        }

        int v = Integer.parseInt(br.readLine());

        System.out.println(arr[100+v]);

    }
}
