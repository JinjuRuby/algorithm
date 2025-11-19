package swexpertacademy.problem.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA5215 {
	
	static int N, L;
	static int[] taste;
	static int[] calories;
	static int maxScore;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int test_case = 1; test_case <= T; test_case++) {
			StringTokenizer NL = new StringTokenizer(br.readLine(), " ");
			
			N = Integer.parseInt(NL.nextToken());
			L = Integer.parseInt(NL.nextToken());
			
			taste = new int[N];
			calories = new int[N];
			
			for (int i = 0; i < N; i++) {
				StringTokenizer TK = new StringTokenizer(br.readLine(), " ");	
				taste[i] = Integer.parseInt(TK.nextToken());
				calories[i] = Integer.parseInt(TK.nextToken());
				
			}
			
			maxScore = 0;
			
			recursion(0, 0, 0);
			
			System.out.println("#" + test_case + " " + maxScore);
		}
		
	}
	
	private static void recursion(int cnt, int sumTaste, int sumCal) {
		
		if (sumCal > L) {
			return;
		}
		
		if (sumTaste > maxScore) {
			maxScore = sumTaste;
		}
		
		if (cnt == N) {
			return;
		}
		
		recursion(cnt + 1, sumTaste + taste[cnt], sumCal + calories[cnt]);
		
		recursion(cnt + 1, sumTaste, sumCal);
		
	}

}
