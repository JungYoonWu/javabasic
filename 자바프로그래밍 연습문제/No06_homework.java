package Chapter02_Home_0326;

import java.util.Scanner;

public class No06_homework {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("철수 : ");
		String chul = input.next();
		System.err.println("영희 : ");
		String young = input.next();
		
		if(((chul.equals("s")) && young.equals("p")) || ((chul.equals("r")) && young.equals("s")) || ((chul.equals("p")) && young.equals("r"))) {
			System.out.println("철수, 승!");
		}else if(((chul.equals("p")) && young.equals("s")) || ((chul.equals("s")) && young.equals("r")) || ((chul.equals("r")) && young.equals("p"))) {
			System.out.println("영희, 승!");
		}else {
			System.out.println("비겼습니다.");
		}

		
	}

}
