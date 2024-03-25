package boj_bronze4to5;

import java.util.Scanner;

public class No_18108 {

	public static void main(String[] args) {
		//1998년생인 내가 태국에서는 2541년생
		Scanner input = new Scanner(System.in);
		
		int year = input.nextInt();
		
		System.out.println(year - 543);
		
		input.close();
	}

}
