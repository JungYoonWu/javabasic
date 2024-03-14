package select;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		//숫자 입력
		System.out.println("숫자를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		
		//if조건문으로 양수음수 판단
		if(num1>0) {
		//양수인 num1을 switch 조건에서 짝수 홀수 판단
			switch(num1 % 2) {
			case 0:
				System.out.println("짝수 입니다.");
				break;
			case 1:
				System.out.println("홀수 입니다.");
				break;
				default:		
			}
	
		}else {
			System.out.println("양수가 아닙니다.");
		}
		input.close();
	}

}
