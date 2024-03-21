package chatper08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("학생 수를 입력하세요. :");
		
		int numStudent = Integer.parseInt(br.readLine());
		System.out.println(numStudent + "명의 성적 :");
		
		String inStr = br.readLine();
		
		StringTokenizer st = new StringTokenizer(inStr, " ");
		
		int[] scores = new int[numStudent];
		
		for(int i = 0; i < numStudent; i++) {
			//nextToken으로 하나의 토근을 가져와서 정수형을 바꾼 데이터를 배열의 요소에 저장
			scores[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		int average = 0;
		
		for(int i = 0; i < numStudent; i++) {
			sum = sum + scores[i];
		}
		average = sum/numStudent;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
		
	}

}
