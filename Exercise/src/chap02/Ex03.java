package chap02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//원기둥의 부피를 구하는 공식
		//밑넓이 곱하기 높이
		//밑넓이는 원의 넓이 공식 3.14*r*r
		double pI = 3.14;
		Scanner input = new Scanner(System.in);
		
		System.out.println("원기둥의 높이는 : ");
		float numH = input.nextFloat();
		
		System.out.println("원기둥의 반지름은 : ");
		float numR = input.nextFloat();
		
		System.out.println("원기둥의 부피는 " + pI*numR*numR*numH );
		
		input.close();
	}

}
