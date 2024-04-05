package classtest;

import java.util.Scanner;

public class CircleDemo01 {

	public static void main(String[] args) {
		System.out.print("원의 반지름 : ");
		Scanner in = new Scanner(System.in);
		
		// Circle 클래스 사용하여 원의 면적 구하여 출력
//		Circle circle = new Circle();
		CircleNew circle = new CircleNew(in.nextDouble());
//		circle.radius = in.nextDouble();
//		circle.getArea();
		
		//원의 반지름 출력
		System.out.println(circle.getRadius());
//		circle.calArea();
		circle.show();
	}
	
	
}


