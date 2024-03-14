package chap02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		//화씨온도를 받아서(F) 섭씨온도(C)로 환산해 출력하는 프로그램 작성
		//화씨온도 F를 섭씨온도C로 바꾸는 수식-> C=(5*(F-32))/9
		Scanner input = new Scanner(System.in);
		
		System.out.println("화씨(F) 온도를 입력하세요.");
		double f = input.nextDouble();
		double c;
		c = (5*(f-32))/9;
		
		System.out.println("화씨 " + f +"도는 " + "섭씨 " + c + "도 입니다.");
		
		input.close();	
	}

}
