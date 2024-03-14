package select;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		//등급 입력
		System.out.println("등급을 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		String grade = input.nextLine();
		
		switch(grade) {
		case "A","a":
		case "B","b":
			System.out.println("아주 열심히 하셨군요!_!_!_!");
			break;
		case "C","c":
			System.out.println("남들 만큼 하셨네요");
			break;
		case "D","d":
			System.out.println("조금 더 노력이 필요합니다.");
			break;
		case "F","f":
			System.out.println("교수실로 찾아오세요.");
			break;
		default:
			System.out.println("다시 입력하세요.");
				break;
		}
		input.close();
	}

}
