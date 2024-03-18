package loop;

import java.util.Scanner;

public class For05_99 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int num = input.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			System.out.println("[구구단 " + i + "단");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + i*j);
			}
			
		}
		
		

	}

}
