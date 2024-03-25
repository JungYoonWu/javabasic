package boj_control;

import java.util.Scanner;

public class boj_14681 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println(1);
		}else if (x > 0 && y < 0) {
			System.out.println(4);
		}else if (x < 0 && y > 0) {
			System.out.println(2);
		}else {
			System.out.println(3);
		}
		
		
		
	}

}
