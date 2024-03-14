package select;

import java.util.Scanner;

public class If03 {
	public static void main(String[] args) {
		//숫자입력
		System.out.println("숫자를 입력하시오.");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		// 양수, 0, 음수 판단
		if(num>0) {
			System.out.println("양수입니다.");
		}else if(num<0) {
			System.out.println("음수입니다.");
		}else {
			System.out.println("0입니다.");
		}
	}
}
