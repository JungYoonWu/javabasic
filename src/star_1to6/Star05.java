package star_1to6;

import java.util.Scanner;

public class Star05 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			for(int j=(num-1); j >= i; j--){					//공백찍기
				System.out.print(" ");
			}
			
			for(int k = 1; k<=(2*i)-1; k++ ) {						//별찍기
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
