package chap02;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		//대학대학을 졸업하려면 최소 140학점을 이수해야 한다고 하자. 
		//이수한 학점 중 전공은 70학점 이상이어야 하며, 교양과 일반은 각각 30학점 이상이거나 총점이 80학점 이상이어야 한다. 
		//학점을 각각 키보드로 입력받아 졸업 여부를 출력하는 프로그램을 작성하시오.
		
		Scanner input = new Scanner(System.in);
		System.out.println("전공 이수 학점을 입력 하세요. ");
		int majorScore = input.nextInt();
		
		System.out.println("교양 이수 학점을 입력 하세요. ");
		int cultureScore = input.nextInt();
		
		System.out.println("일반 이수 학점을 입력 하세요.");
		int normalScore = input.nextInt();
		
		if((majorScore+cultureScore+normalScore) >= 140) {
			if((majorScore>=70 && (normalScore+cultureScore)>=80) || (majorScore>=70 && normalScore>=30 && cultureScore >= 30)) {
				System.out.println("졸업 가능");
			}else {
				System.out.println("졸업 불가능");
			}
		}else {
			System.out.println("졸업 불가능");
		}
		input.close();
	}

}
