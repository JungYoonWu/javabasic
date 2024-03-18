package loop;

import java.util.Scanner;

public class For05 {
	// 숙제
	public static void main(String[] args) {
		System.out.println("양의 숫자를 입력하세요.");
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int sum = 0;
		
		while(num <= 0) {
			System.out.println("양의 숫자가 아닙니다. 다시 입력하세요");
			num = input.nextInt();
		}
		
		for(int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 "+ num + "까지의 합은 " + sum + "입니다.");
		
	}

}
