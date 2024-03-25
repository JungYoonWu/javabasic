package boj_Loop_Bronze5to3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_10951 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		
		String inStr;
		
		while((inStr = br.readLine()) != null) { //입력값이 있다면 반복문 실행
			
			if(inStr.equals("")) break;			//.readLine() 이 null을 반환하는 경우를 명시적으로 적용
			
			st = new StringTokenizer(inStr, " ");
			
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			sb.append(num1+num2).append('\n');
		}
		
		System.out.println(sb);
		
	}

}
