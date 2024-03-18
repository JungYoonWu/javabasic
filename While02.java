package loop;

import java.util.Scanner;

public class While02 {
	//숙제
	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요.");
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum = 0;
		
		while(num != 0) {
			System.out.println("숫자를 입력하세요.");			
			sum = sum + num;
			num = input.nextInt();
		}
		
		System.out.println("지금까지 입력한 숫자의 합은 " + sum + "입니다.");
	//	input.close();
	}

}
