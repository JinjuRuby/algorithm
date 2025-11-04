package swexpertacademy.problem.d2;

import java.util.Scanner;

public class 간단한소인수분해1945 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= testCase; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();

            int[] divs = {2, 3, 5, 7, 11};
            int[] exponents = new int[divs.length];

            for (int j = 0; j < divs.length; j++) {
                exponents[j] = getExponent(n, divs[j]);
            }

            System.out.print("#" + i);
            for (int exponent : exponents) {
                System.out.print(" " + exponent);
            }
            System.out.println();

        }
    }

    private static int getExponent(int n, int div) {

        int exponent = 0;

        while (n % div == 0) {
            n = n / div;
            exponent++;
        }

        return exponent;
    }
}
