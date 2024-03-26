package boj_homework_ht00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2562 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] numArr = new int[9];
		int max = 0;
		int dataAt = 0;
		
		for(int i = 0; i < 9; i ++) {
			numArr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int j = 0; j < 9; j++) {
			if(numArr[j]>max) {
				max = numArr[j];
				dataAt = j+1;
			}
		}
	
		System.out.println(max);
		System.out.println(dataAt);
		
		
	}

}
