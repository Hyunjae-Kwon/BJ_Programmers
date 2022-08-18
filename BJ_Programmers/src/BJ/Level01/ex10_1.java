package BJ.Level01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex10_1 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = {1, 1, 2, 2, 2, 8};
		
		int[] result = new int[st.countTokens()];
		
		for(int i = 0; i < arr.length; i ++) {
			result[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0; i < arr.length; i ++) {
			result[i] = arr[i] - result[i];
			System.out.print(result[i] + " ");
		}
	}
}
