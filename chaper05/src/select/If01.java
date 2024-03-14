package select;

import java.util.Scanner;

public class If01 {
	public static void main(String[] args) {
		// 세 개의 숫자를 입력
		Scanner input = new Scanner(System.in);
		System.out.println("세 개의 숫자를 입력하시오.");
		int numA = input.nextInt();
		int numB = input.nextInt();
		int numC = input.nextInt();
		
		// 최대값 구하기
		int max = numA;
		// numB를 조사
		if(numB > max) {
			max = numB;
		}
		// numC를 조사
		if(numC > max){
			max = numC;
		}
		// 최대값 출력
		System.out.println("가장 큰 수는"+ max + "입니다.");
	}
}
