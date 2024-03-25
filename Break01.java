package chapter09;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		//숙제
		
		Scanner input = new Scanner(System.in);
		
		int num;
		
		while(true) {
			
			num = input.nextInt();
			if(num > 0) break;
			
		}
		
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + num + "까지의 합 : " + sum);
		
	}

}
