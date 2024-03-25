package boj_Loop_Bronze5to3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_25314 {

	public static void main(String[] args) throws IOException {
		
		//nbyte 자료형 long int
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //br 객체 만들기
		
		int num = Integer.parseInt(br.readLine()); // int형 변수 num에 br객체에 readline매소드 참조해서 읽은 stringtype변수를
												   // 형변환을 통해 int형으로 바꾼뒤 대입.
		
		StringBuilder sb = new StringBuilder();	   // sb 객체 생성
												   
		
		for(int i = 0; i < num/4; i++) {		   // num을 4로 나눈 값의 몫만큼 long출력 하는 for문 작성
			sb.append("long ");					   // sb객체에 append매소드 참조해서 long sb에 long 추가
		}										   // 
		
		sb.append("int");						   // 입력받은 num값에 맞는 long 값 뒤에 int값 추가
		System.out.println(sb);					   // sb객체에 입력된 문자열 출력
		
		
	}

}
