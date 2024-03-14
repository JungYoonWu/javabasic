package select;

import java.util.Scanner;

public class StringConv {

	public static void main(String[] args) {
		// 숫자 입력 받기
		Scanner input = new Scanner(System.in);
		System.out.println("세 개의 숫자를 입력하세요 : ");
		
		int num1 = Integer.parseInt(input.next());
		// String tempA = input.next();
		// int num1 = Integer.parseInt(tempA); 
		// Integer.parseInt를 사용해서 string인 next()값을 int로 변환하는방식과 동일한 방식이다.
		
		int num2 = Integer.parseInt(input.next());
		int num3 = Integer.parseInt(input.next());
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

	}

}
