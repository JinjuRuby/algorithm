package swexpertacademy.problem.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA2071 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			
			double total = 0;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			StringBuilder sb = new StringBuilder();
			
			while (st.hasMoreTokens()) {
				
				double index = Integer.parseInt(st.nextToken());
				
				total+=index;
				
			}
			
			sb.append("#").append(i).append(" ").append(Math.round(total / 10));
			System.out.println(sb);
		}
		
	}
}
