package boj_Loop_Bronze5to3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_10952 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		
		while(true) {
			String inStr = br.readLine();								// String형 변수 inStr에 br객체에 readLine메소드를
																		// 참조해서 읽은 String형 변수를 저장

			StringTokenizer st = new StringTokenizer(inStr, " ");		// StringTokenizer 객체를 통해서 inStr에 대입된 값을 
																		// " " 공백을 기준으로 구분해서 저장함

			int num1 = Integer.parseInt(st.nextToken());				// 공백단위로 구분된 st값을 순서대로 num1,num2에 대입
			int num2 = Integer.parseInt(st.nextToken());  
			
				if(num1 == 0 && num2 == 0) {							//num1값과 num2값이 둘다 0이면 while문 탈출
					break;
					}
			sb.append((num1+num2)).append('\n');						//StringBuilder객체에 num1+num2값을 append메소드로 추가
																		//append메소드로 줄바꿈 추가
	
			}
		System.out.println(sb);											//sb객체에 저장된 내용 출력
		
	}
}
