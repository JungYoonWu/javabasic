package loop;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		
		System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");

		input.close();
	}

}
