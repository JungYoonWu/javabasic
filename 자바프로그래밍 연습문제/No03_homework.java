package Chapter02_Home_0326;

import java.util.Scanner;

public class No03_homework {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		int sum = 0;
		do {
			System.out.println("양의 정수를 입력하세요 : ");
			num = input.nextInt();
			if(num % 2 == 0) {
				sum += num;
			}
		}while(num>0);
		
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);

	}

}
