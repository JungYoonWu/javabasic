package boj_Loop_Bronze5to3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10872 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		int num = Integer.parseInt(br.readLine());
		long factorial = 1;
		if(num>0) {
			for(int i = 1; i<= num; i++) {
				factorial = factorial*i;
			}	
		}else if(num == 0) {
			factorial = 1;
		}
		
		System.out.println(factorial);
		
	}

}
