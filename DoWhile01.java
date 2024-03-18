package loop;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		
		int sum = 0;
		int num = input.nextInt();
		do {
			sum = num + sum;
			num = input.nextInt();
			
			
		}while(num!=0);
		
		System.out.println("지금 까지 입력한 숫자의 합은 " + sum +"입니다.");
	}

}
