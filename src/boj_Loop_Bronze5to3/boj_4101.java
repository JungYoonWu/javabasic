package boj_Loop_Bronze5to3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_4101 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
				
		while(true) {
			String inStr = br.readLine();
			
			StringTokenizer st = new StringTokenizer(inStr," ");
			
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			if(num1==0 && num2 == 0) break;
			
			if(num1 > num2) {
				sb.append("Yes").append('\n');
			}else {
				sb.append("No").append('\n');
			}
			
			
		}System.out.println(sb);
		
		
	}

}
