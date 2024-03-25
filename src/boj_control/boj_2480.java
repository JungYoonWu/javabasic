package boj_control;

import java.util.Scanner;

public class boj_2480 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		int money = 0;
		int max = a;
		
		if(a==b && a==c) {
			money = 10000 + 1000*a;
		}else if((a==b && a != c) || (a==c && a != b)) {
			money = 1000 + 100*a;
		}else if(b==c && a != b) {
			money = 1000 + 100*b;
		}else {
			if(max<b) {
				max = b;
			}
			if(max<c) {
				max = c;
			}
			
			money = max*100;
		}
		System.out.println(money);
	}
}
