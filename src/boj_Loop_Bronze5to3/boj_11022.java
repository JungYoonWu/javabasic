package boj_Loop_Bronze5to3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_11022 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int numTest = Integer.parseInt(br.readLine());		// 처음 입력값은 test횟수 br.readline으로 한줄입력받고 그 값을 int로 형변환
		
		StringTokenizer st;									// StringTokenizer 객체 선언
		
		for(int i = 1; i <= numTest; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");	// StringTokenizer객체에 bufferedreader객체에서 readline으로 불러온 문자열 값을
															// 공백을 이용해서 토큰화해서 st객체에 저장
			
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			sb.append("Case #").append(i).append(": ").append(num1).append(" + ").append(num2).append(" = ").append(num1+num2).append('\n');
			
		}
		
		System.out.println(sb);
	}

}
