package swexpertacademy.problem.d2;

import java.util.Scanner;

public class 지그재그숫자1986 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 1; i <= t; i++) {
            int result = 0;

            int n = scanner.nextInt();

            for (int j = 1; j <= n; j++) {
                if (j % 2 == 1) {
                    result += j;
                } else {
                    result -= j;
                }

            }


            System.out.println("#" + i + " " + result);
        }

    }
}
