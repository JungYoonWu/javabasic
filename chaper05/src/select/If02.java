package select;

import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		//숫자 입력
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하시오.");
		int num = input.nextInt();
		//홀수 짝수 판단
		if(num%2==0) {
			System.out.println("짝수 입니다.");
		}else {
			System.out.println("홀수 입니다.");
		}
	}
}
