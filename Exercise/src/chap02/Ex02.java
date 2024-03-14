package chap02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//제곱할 숫자를 입력받는다.
		Scanner input = new Scanner(System.in);
		System.out.println("제곱할 정수를 입력하세요.");
		
		//입력 받은 숫자를 num에 넣고 num값을 제곱한 값을 square에 넣는다.
		int num = input.nextInt();
		int square = num*num;
		System.out.println(num +"의 제곱 값은 "+ square+"이다.");
		input.close();
	}
	

}
