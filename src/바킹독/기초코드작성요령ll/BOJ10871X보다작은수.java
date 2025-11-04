package 바킹독.기초코드작성요령ll;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ10871X보다작은수 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();

        int[] seq = new int[n];
        for (int i = 0; i < seq.length; i++) {
            seq[i] = scanner.nextInt();
        }

        ArrayList<Integer> integers = new ArrayList<>();
        for (int i : seq) {
            if (i < x) {
                integers.add(i);
            }
        }

        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
    }
}
