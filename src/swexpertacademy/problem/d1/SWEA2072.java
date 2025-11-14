package swexpertacademy.problem.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA2072 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			
			StringBuilder sb = new StringBuilder();
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int total = 0;
			
			for (int j = 0; j < 10; j++) {
				
				int index = Integer.parseInt(st.nextToken());
				
				if (index % 2 == 1) {
					total += index;
				}
			}
			
			sb.append("#").append(i+1).append(" ").append(total);
			System.out.println(sb);
		}
		
		
	}
}