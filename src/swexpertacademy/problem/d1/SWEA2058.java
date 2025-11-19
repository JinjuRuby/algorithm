package swexpertacademy.problem.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA2058 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		
		int total = 0;
		
		for (int i = 0; i < N.length(); i++) {
			
			int index = N.charAt(i) - '0';
			
			total += index;
		}
		
		System.out.print(total);

	}

}
