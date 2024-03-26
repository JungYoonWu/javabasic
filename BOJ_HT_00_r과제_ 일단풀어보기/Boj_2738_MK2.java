package boj_homework_ht00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Scanner가 아닌 BufferedReader와 StringTokenizer를 사용하여 2차원배열열 선언과 값 입력을 하기위한 연습

public class Boj_2738_MK2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String inStr = br.readLine();
		
		StringTokenizer st = new StringTokenizer(inStr, " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int numArr1 [][] = new int[n][m];
		int numArr2 [][] = new int[n][m];
		int sumArr [][] = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			inStr = br.readLine();
	//		StringTokenizer(inStr, " ");
			
			for(int j = 0; j < m; j++) {
				numArr1[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				numArr2[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				sumArr[i][j] = numArr1[i][j] + numArr2[i][j];
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(sumArr[i][j] + " ");
			}System.out.println();
		}
		
	}

}