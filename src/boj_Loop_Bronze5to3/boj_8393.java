package boj_Loop_Bronze5to3;

import java.util.Scanner;

public class boj_8393 {

	public static void main(String[] args) {
		//n값을 입력받아서 1부터 n까지의 합을 출력
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}
