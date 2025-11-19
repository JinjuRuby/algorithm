package 바킹독.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1926 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] grid = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        Deque<Point> deque = new ArrayDeque<>();

        int count = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer line = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < m; j++) {
                grid[i][j] = Integer.parseInt(line.nextToken());
                visited[i][j] = false;
            }
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 1 && visited[i][j] == false) {

                    count++;
                    int current_area = 1;
                    visited[i][j] = true;
                    deque.offer(new Point(i, j));
                }

                while (!deque.isEmpty()) {

                }

            }
        }

    }

    private static class Point {
        private int x;
        private int y;

        public Point(int y, int x) {
            this.y = y;
            this.x = x;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }


}
