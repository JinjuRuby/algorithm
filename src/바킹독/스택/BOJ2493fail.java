package 바킹독.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ2493fail {

    public static void main(String[] args) throws IOException {

        Stack<TowerInfo> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int countTower = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= countTower; i++) {

            int towerHeight = Integer.parseInt(st.nextToken());


            while (!stack.isEmpty()) {

                TowerInfo peek = stack.peek();

                if (peek.getTowerHeight() > towerHeight) {
                    sb.append(peek.getTowerNumber()).append(" ");
                    break;
                } else {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                sb.append("0 ");
            }

            stack.push(new TowerInfo(i, towerHeight));
        }

        System.out.println(sb.toString());
    }

    private static class TowerInfo {
        private final int towerNumber;
        private final int towerHeight;

        public TowerInfo(int towerNumber, int towerHeight) {
            this.towerNumber = towerNumber;
            this.towerHeight = towerHeight;
        }

        public int getTowerNumber() {
            return towerNumber;
        }

        public int getTowerHeight() {
            return towerHeight;
        }

    }
}
