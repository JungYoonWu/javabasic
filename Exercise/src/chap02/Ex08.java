package chap02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// 키보드로 0~999사이 정수를 입력받아 각 자릿수를 더한 결과를 출력하는 프로그램을 작성하시오.
		
		Scanner input = new Scanner(System.in);
		System.out.println("0~999사이의 정수를 입력하세요.");
		int num = input.nextInt();
		
		int num100 	= num/100;
		int num10 	= (num - (num100 * 100)) / 10;
		int num1	= (num - (num100 * 100) - (num10 * 10));
		int numSum 	= num1 + num10 + num100;

		System.out.println("백의 자리수는 "+ num100 + "," + "십의 자리수는 " + num10 +"," +"일의 자리수는 " + num1 + "이므로 각 자리수의 합은" + numSum + "입니다.");
		
		input.close();
		
	}

}
