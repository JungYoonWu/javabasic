package Chapter02_Home_0326;

import java.util.Scanner;

public class No02_homework {

	public static void main(String[] args) {
		
		System.out.println("등수를 입력해주세요.");
		Scanner input = new Scanner(System.in);
		
		int rank = input.nextInt();
		
		switch(rank) {
		case 1: 
			System.out.println("아주잘했습니다.");
			break;
		case 2 :
		case 3 :
			System.out.println("잘했습니다.");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("보통입니다");
			break;
		default:
			System.out.println("노력해야겠습니다");
			break;
		}
		
	}

}
