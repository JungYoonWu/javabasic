package boj_control;

import java.util.Scanner;

public class boj_2884 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int hour = input.nextInt();
		int min = input.nextInt();
		
		if(min < 45) {
			hour = hour - 1;
			min = 60 - (45 - min);
			
			if(hour < 0) {
				hour = 23;
			}
			System.out.println(hour + " " + min);
		}else {
			System.out.println(hour + " " + (min - 45));
		}
		
	}

}
