package boj_bronze4to5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_14652 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String inStr = br.readLine();
		
		StringTokenizer st = new StringTokenizer(inStr, " ");
		
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken());
		
		System.out.println(num/col + " " + num%col);
		

	}

}
