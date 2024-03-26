package boj_homework_ht00;

import java.util.Scanner;

public class Boj_2738 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		int numArr1 [][] = new int[n][m];
		int numArr2 [][] = new int[n][m];
		int sumArr [][] = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				numArr1[i][j] = input.nextInt();
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				numArr2[i][j] = input.nextInt();
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
