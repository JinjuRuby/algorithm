package swexpertacademy.problem.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA2005fail {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int test_case = 1; test_case <= T; test_case++) {
			
			int N = Integer.parseInt(br.readLine());
			int[][] pascal = new int[N][N];
			
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < N; i++) {
				
				for (int j = 0; j <= i; j++) {
					
					if(j == 0 || j == i) {
						pascal[i][j] = 1;
					} else {
						pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];  
					}
					
				}
				
			}
			
			sb.append("#").append(test_case).append("\n");
			for (int i = 0; i < N; i++) {
				for (int j = 0; j <= i; j++) {
					sb.append(pascal[i][j]).append(" ");
				}
				sb.append("\n");
			}
			
			System.out.print(sb);
		}

	}

}
