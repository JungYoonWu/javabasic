package boj_control;

import java.util.Scanner;

public class boj_2525 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int m1 = a*60 + b + c; //시간단위->분단위
		
		int h = (m1 / 60) % 24;
		int m2 = m1 % 60;
		
		System.out.println(h + " " + m2);
		
	}

}
