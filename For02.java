package loop;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		
		System.out.println("5개의 숫자를 입력하세요. ");
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			
			int num = input.nextInt();
			sum = num + sum;
		}
		
		System.out.println("5개의 숫자의 합은 " + sum + "입니다.");

	}

}
