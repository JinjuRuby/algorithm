package swexpertacademy.problem.d2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 최빈수구하기1204 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int test_case = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < test_case; i++) {

            Map<Integer, Integer> map = new HashMap<>();

            int testCaseNumber = scanner.nextInt();
            scanner.nextLine();

            String[] scoresString = scanner.nextLine().split(" ");
            int[] scores = new int[scoresString.length];

            for (int j = 0; j < scoresString.length; j++) {
                scores[j] = Integer.parseInt(scoresString[j]);
            }

            for (int score : scores) {
                Integer get = map.getOrDefault(score, 0);
                map.put(score, get + 1);
            }

            int maxFreq = 0;
            int mode = 0;
            for (Integer key : map.keySet()) {
                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    mode = key;
                } else if (map.get(key) == maxFreq) {
                    mode = key > mode ? key : mode;
                }
            }

            System.out.println("#" + testCaseNumber + " " + mode);
        }


    }
}
