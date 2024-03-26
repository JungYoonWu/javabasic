package Chapter02_Home_0326;

import java.util.Scanner;

public class No01_homework {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int age = input.nextInt();
		
		if(age >=19) {
			System.out.println("성년");
		}else {
			System.out.println("미성년");
		}
		
	}

}
