package swexpertacademy.problem.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1206fail {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 10; i++) {
			
			int N = Integer.parseInt(br.readLine());
			int maxBuilding = 0;
			int total = 0;
			int[] arr = new int [N];
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			StringBuilder sb = new StringBuilder();
			
			for (int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			for (int j = 2; j < N - 2; j++) {
					
				maxBuilding = arr[j-2];
				
				if (maxBuilding < arr[j-1]) {
					maxBuilding = arr[j-1];	
				}
				
				if (maxBuilding < arr[j+1]) {
					maxBuilding = arr[j+1];	
				}
				
				if (maxBuilding < arr[j+2]) {
					maxBuilding = arr[j+2];	
				}
			
				if (maxBuilding < arr[j]) {
					total += (arr[j] - maxBuilding);
				}
			}
			
			sb.append("#").append(i+1).append(" ").append(total);
			System.out.println(sb);
		}
		
	}

}
