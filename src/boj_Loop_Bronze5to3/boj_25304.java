package boj_Loop_Bronze5to3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_25304 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sumTotal = 0;
		
		int totalMoney = Integer.parseInt(br.readLine());
		int totalListNum = Integer.parseInt(br.readLine());
		
		for(int i = 1; i<=totalListNum; i++) {
			
			String inStr = br.readLine();
			StringTokenizer st = new StringTokenizer(inStr, " ");
			
			int listMoney = Integer.parseInt(st.nextToken()); 
			int listNum =  Integer.parseInt(st.nextToken());
			
			sumTotal = sumTotal + listMoney*listNum;
			
			
		}
		
		
		
		if(totalMoney == sumTotal) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}

}
