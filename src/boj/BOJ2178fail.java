package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ2178fail {

	static int N;
	static int M;
	
	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer NM = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(NM.nextToken());
		M = Integer.parseInt(NM.nextToken());
		
		int[][] arr = new int[N][M];
		boolean[][] visited = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			
			String line = br.readLine();
			
			for (int j = 0; j < M; j++) {
				
				arr[i][j] = line.charAt(j) - '0';
			}
		}
		
		int[][] result = bfs(arr, visited, 0,0);
		
		System.out.println(result[N-1][M-1]);

		
	}
	
	static int[][] bfs(int[][] arr, boolean[][] visited, int row, int col) {
		
		 Deque<int[]> queue = new ArrayDeque<>();
		 
		 int[] x = {0, 0, -1, 1};
		 int[] y = {1, -1, 0, 0};
		 
		 int[] coor = {row, col};
		 queue.add(coor);
		 
		 while(!queue.isEmpty() ) {
			 
			 int[] current = queue.poll();
			 int r = current[0];
			 int c = current[1];
			 
			 for (int i = 0; i < 4; i++) {
				 
				 int moveR = r + x[i];
				 int moveC = c + y[i];
				 
				 if (moveR < 0 || moveC < 0 || moveR >= N || moveC >= M) {
					 continue;
				 }
				 
				 if (!visited[moveR][moveC] && arr[moveR][moveC] == 1) {
					 
					 arr[moveR][moveC] = arr[r][c] + 1;
					 visited[moveR][moveC] = true;
					 
					 queue.add(new int[] {moveR, moveC});
				 }
				 
			 }
			 
		 }
		 
		 return arr;
	}
	
}
