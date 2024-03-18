package loop;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		
		int num = input.nextInt();
		int sum = 0;
		int i = 1;
		
		while(i <= num) {
			
			sum = sum + i;   // sum += i;
			i++;
			
		}
		System.out.println("1부터" + num + "까지의 숫자의 합은 " + sum + " 입니다.");
		
		input.close();
	}

}
