package 바킹독.배열;

import java.util.Scanner;

public class BOJ알파벳개수10808 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] sArray = s.split("");

        int[] count = new int[26];

        // 내 풀이
/*
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }


        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i].equals("a")) {
                count[0] += 1;
            } else if (sArray[i].equals("b")) {
                count[1] += 1;
            } else if (sArray[i].equals("c")) {
                count[2] += 1;
            } else if (sArray[i].equals("d")) {
                count[3] += 1;
            } else if (sArray[i].equals("e")) {
                count[4] += 1;
            } else if (sArray[i].equals("f")) {
                count[5] += 1;
            } else if (sArray[i].equals("g")) {
                count[6] += 1;
            } else if (sArray[i].equals("h")) {
                count[7] += 1;
            } else if (sArray[i].equals("i")) {
                count[8] += 1;
            } else if (sArray[i].equals("j")) {
                count[9] += 1;
            } else if (sArray[i].equals("k")) {
                count[10] += 1;
            } else if (sArray[i].equals("l")) {
                count[11] += 1;
            } else if (sArray[i].equals("m")) {
                count[12] += 1;
            } else if (sArray[i].equals("n")) {
                count[13] += 1;
            } else if (sArray[i].equals("o")) {
                count[14] += 1;
            } else if (sArray[i].equals("p")) {
                count[15] += 1;
            } else if (sArray[i].equals("q")) {
                count[16] += 1;
            } else if (sArray[i].equals("r")) {
                count[17] += 1;
            } else if (sArray[i].equals("s")) {
                count[18] += 1;
            } else if (sArray[i].equals("t")) {
                count[19] += 1;
            } else if (sArray[i].equals("u")) {
                count[20] += 1;
            } else if (sArray[i].equals("v")) {
                count[21] += 1;
            } else if (sArray[i].equals("w")) {
                count[22] += 1;
            } else if (sArray[i].equals("x")) {
                count[23] += 1;
            } else if (sArray[i].equals("y")) {
                count[24] += 1;
            } else if (sArray[i].equals("z")) {
                count[25] += 1;
            }
        }
        */

        // 정석 코드(아스키코드 사용)
        for (int i = 0; i < sArray.length; i++) {
            int index = sArray[i].charAt(0) - 'a';

            count[index]++;
        }

        for (int i : count) {
            System.out.print(i + " ");
        }

    }
}
