package star_1to6;

import java.util.Scanner;

public class Star06 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			for(int k=1; k<=i-1; k++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=2*(num+1-i)-1; j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
	}

}
