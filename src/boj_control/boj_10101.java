package boj_control;

import java.util.Scanner;

public class boj_10101 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if(a+b+c != 180) {
			System.out.println("Error");
		}else if(a == b && b == c) {
			System.out.println("Equilateral");
		}else if(a == b || a == c || b == c) {
			System.out.println("Isosceles");
		}else {
			System.out.println("Scalene");
		}
	}

}
