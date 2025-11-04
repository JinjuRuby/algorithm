package swexpertacademy.problem.d2;

import java.util.Scanner;

public class 초심자의회문검사1989 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= testCase; i++) {
            int result = 1;
            String s = scanner.nextLine();

            String[] split = s.split("");
            for (int j = 0; j < (split.length / 2); j++) {

                if (!split[j].equals(split[split.length - (j + 1)])) {
                    result = 0;
                    break;
                }
            }

            System.out.println("#" + i + " " + result);

        }
    }
}
