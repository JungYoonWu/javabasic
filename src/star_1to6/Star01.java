package star_1to6;

import java.util.Scanner;

public class Star01 {
	//입력받은 만큼 별찍기
	public static void main(String[] args) {
		
		//입력받기
		System.out.println("숫자를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		for(int i = 1; i <= num; i++) {//별찍은뒤 줄바꾸는곳
			for(int j = 1; j <= i; j++) {//입력받은 숫자만큼 별 찍기
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
