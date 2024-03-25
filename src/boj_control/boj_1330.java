package boj_control;

import java.util.Scanner;

public class boj_1330 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		if(a>b) {
			System.out.println(">");
		}else if(a<b){
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		

	}

}
