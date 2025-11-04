package swexpertacademy.problem.d2;

import java.util.Scanner;

public class 백만장자프로젝트1859fail {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < testCases; i++) {

            int days = scanner.nextInt();
            scanner.nextLine();
            String[] dayPricesString = scanner.nextLine().split(" ");

            int[] dayPrices = new int[days];
            for (int j = 0; j < days; j++) {
                dayPrices[j] = Integer.parseInt(dayPricesString[j]);
            }

            int profit = 0;
            int count = 0;
            int buy = 0;
            // days - 1 미만이므로 뒤에서 두 번째 인덱스까지 접근한다
            for (int j = 0; j < days - 1; j++) {

                if (dayPrices[j] <= dayPrices[j + 1]) {
                    buy += dayPrices[j];
                    count += 1;
                } else if (buy > 0 && dayPrices[j] > dayPrices[j + 1]) {
                    profit += (dayPrices[j] * count) - buy;
                    buy = 0;
                    count = 0;
                }
            }

            if (dayPrices[days - 1] > dayPrices[days - 2]) {
                profit += (dayPrices[days - 1] * count) - buy;
                buy = 0;
                count = 0;
            }

            System.out.println("profit = " + profit);
        }

    }
}
