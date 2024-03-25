package boj_Loop_Bronze5to3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_27433 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String inStr = br.readLine();
		long factorial = 1;
		int num = Integer.parseInt(inStr);
		
		if(num > 0) {
			for(int i = 1; i <= num; i++) {
				factorial = factorial*i;
			}
		}else if (num == 0) {
			factorial = 1;
		}
		
		sb.append(factorial);
		
		System.out.println(sb);
		
	}

}
