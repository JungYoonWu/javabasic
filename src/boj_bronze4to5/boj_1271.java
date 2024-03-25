package boj_bronze4to5;

import java.math.BigInteger;
import java.util.Scanner;

public class boj_1271 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		BigInteger money = input.nextBigInteger();
		BigInteger num = input.nextBigInteger();
		
		
		
		System.out.println(money.divide(num));
		System.out.println(money.remainder(num));
		
	}

}
