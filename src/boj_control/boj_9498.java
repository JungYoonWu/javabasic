package boj_control;

import java.util.Scanner;

public class boj_9498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a>=90&&a<=100) {
			System.out.println("A");
		}else if(a<90&&a>=80) {
			System.out.println("B");
		}else if(a<80&&a>=70) {
			System.out.println("C");
		}else if(a<70&&a>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}

}
