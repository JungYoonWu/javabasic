package chap02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//초를 입력 받는다
		Scanner input = new Scanner(System.in);
		System.out.println("초를 입력하세요. ");
		
		//분은 초/60
		//시간은 분/60
		//남은 초는 60보다 작으니까 나머지를 구한다. 초%60
		int secFull = input.nextInt();
		int min = secFull/60;
		int hour = min/60;
		int secSm = secFull%60;
		
		System.out.println(secFull + "초 는" + hour + "시간 " + min + "분 " + secSm +"초 입니다.");
		
		input.close();
	}

}
