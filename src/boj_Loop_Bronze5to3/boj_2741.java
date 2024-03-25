package boj_Loop_Bronze5to3;

import java.util.Scanner;

public class boj_2741 {

	public static void main(String[] args) {
		// 1부터 입력받은 숫자까지 출력하기
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		for(int i = 1; i<= num; i++) {
			System.out.println(i);
		}
	}

}
