package classtest;

public class CircleNew {
	
	private double radius;
	private double area;
	final double PI = 3.14;
	
	CircleNew(double radius){
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public double getPI() {
		return PI;
	}

	
	
	double getArea() {
		return area;
	}
	
	void calArea() {
		area = PI*radius*radius;
	}
		
	void show(double radius, double area) {
		System.out.printf("반지름은 = %.2f, 면적 = %.2f\n", radius, area);
	}
	void show() {
		System.out.printf("반지름은 = %.2f, 면적 = %.2f\n", radius, area);
	}
}
