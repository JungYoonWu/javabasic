package Chapter02_Home_0326;

import java.util.Scanner;

public class No07_homework {

	public static void main(String[] args) {
		String chul = input("철수");
		String young = input("영희");

		whosWin(chul,young);
	}
	
	static String input(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.print(message + " : ");
		String rsp = sc.next();
		
		return rsp;
	}
	
	static void whosWin(String chulHand, String youngHand) {
		if(((chulHand.equals("s")) && youngHand.equals("p")) || ((chulHand.equals("r")) && youngHand.equals("s")) || ((chulHand.equals("p")) && youngHand.equals("r"))) {
			System.out.println("철수, 승!");
		}else if(((chulHand.equals("p")) && youngHand.equals("s")) || ((chulHand.equals("s")) && youngHand.equals("r")) || ((chulHand.equals("r")) && youngHand.equals("p"))) {
			System.out.println("영희, 승!");
		}else {
			System.out.println("비겼습니다.");
	}
	}

}
