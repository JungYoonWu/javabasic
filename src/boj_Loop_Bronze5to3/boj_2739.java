package boj_Loop_Bronze5to3;

import java.util.Scanner;

public class boj_2739 {

	public static void main(String[] args) {
		//입력받은 숫자의 구구단 만들기
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i +" = " +num*i);
		}
	}

}
