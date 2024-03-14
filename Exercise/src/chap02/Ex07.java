package chap02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		//키보드로 정수를 입력받아
		// 1. 4와 5로 나누어지는지
		// 2. 4또는 5로 나누어지는지
		// 3. 4나 5중 하나로 나누어 지지만 두 수 모두로는 나누어지지 않는지를 t/f로 출력하는 프로그램 작성
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		if((num % 4)==0 && (num % 5)==0) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		if(((num%4)==0) || ((num % 5)==0)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		//무슨말이지ㅇㅅㅇ;
		input.close();
	}

}
