package loop;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		
		int bContinue = 1;
		
		while(bContinue == 1) {
			// 숫자를 입력
			System.out.println("숫자를 입력하세요 : ");
			Scanner input = new Scanner(System.in);
			
			int num = input.nextInt();
			
			//짝수 홀수 확인
			if(num % 2 == 0) {
				System.out.println(">> 짝수 입니다.");
			}else {
				System.out.println(">> 홀수 입니다.");
			}
			
			//계속 할것인지 확인
			System.out.println(" 계속 하겠습니까? (0_멈춤/1_계속) : ");
			bContinue = input.nextInt();
			
		}
		
	}

}
