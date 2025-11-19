package swexpertacademy.problem.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA1220 {

	public static void main(String[] args) throws IOException {
		
		for (int i = 0; i < 10; i++) {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int length = Integer.parseInt(br.readLine());
			String[][] arr = new String[8][8]; 
			
			for (int j = 0; j < 8; j++) {
				String line = br.readLine();
				
				String[] subArr = line.split("");
				arr[j] = subArr;
			}
			
			for (int j = 0; j < 8; j++) {
				
				
				for (int k = 0; j < 8 - length; j++) {
					
				}
			}
			
			
			
		}
		
	}

}
