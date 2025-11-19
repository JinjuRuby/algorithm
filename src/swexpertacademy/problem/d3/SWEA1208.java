package swexpertacademy.problem.d3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SWEA1208 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int testCase = 1; testCase <= 10; testCase++) {
			
			int dump = Integer.parseInt(br.readLine());
			int result = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			List<Integer> list = new ArrayList<Integer>();
			
			while (st.hasMoreTokens()) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			
			for (int i = 0; i < dump; i++) {
				
				int min = 101, minIndex = 0, max = 0, maxIndex = 0;
				
				for (int j = 0; j < list.size(); j++) {
					
					int num = list.get(j);
					
					if (min > num) {
						
						min = num;
						minIndex = j;
					}
					
					if (max < num) {
						
						max = num;
						maxIndex = j;
					}
				}
				
				list.set(minIndex, ++min);
				list.set(maxIndex, --max);
				
				for (int j = 0; j < list.size(); j++) {
					
					int num = list.get(j);
					
					if (min > num) {
						
						min = num;
						minIndex = j;
					}
					
					if (max < num) {
						
						max = num;
						maxIndex = j;
					}
				}

				result = max - min;
				
				if (max == min + 1 || max == min) {
					break;
				}
				
			}
			
			System.out.println("#" + testCase + " " + result);
			
		}

	}

}
