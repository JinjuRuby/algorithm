package 바킹독.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11328 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            String result = "Possible";

            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = 2;
            String[] array = new String[count];

            for (int j = 0; j < count; j++) {
                array[j] = st.nextToken();
            }

            char[] word;
            char[] check;

            word = array[0].toCharArray();
            Arrays.sort(word);
            check = array[1].toCharArray();
            Arrays.sort(check);

            if (word.length != check.length) {
                System.out.println("Impossible");
                continue;
            }

            for (int j = 0; j < word.length; j++) {

                if (word[j] != check[j]) {
                    result = "Impossible";
                    break;
                }

            }

            System.out.println(result);

        }
    }
}
