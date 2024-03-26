package boj_homework_ht00;

import java.util.Scanner;

public class Boj_11720 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numA = input.nextInt();
		String inStr = input.next();
		int sum = 0;
		
		for(int i = 0; i < numA; i++) {
			sum = sum + inStr.charAt(i) - 48;
		}
		
		System.out.println(sum);
		
	}

}
