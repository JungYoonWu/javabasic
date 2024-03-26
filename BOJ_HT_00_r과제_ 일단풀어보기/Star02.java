package star_1to6;

import java.util.Scanner;

public class Star02 {

	public static void main(String[] args) {
		//입력받기
		System.out.println("숫자를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		for(int i = num; i >=1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
