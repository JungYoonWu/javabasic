package chap04;

public class Triangle01 {
	private double height;	//필드에 있는 맴버변수 private 높이, 밑변
	public double getHeight() {
		return height;
	}
	public double getBase() {
		return base;
	}
	private double base;
	
	Triangle01(double height, double base){//Triangle 객체를 만들때 필요한 높이와밑변값을 생성자로 받는다.
		this.height = height;
		this.base = base; 
	}
	public double findArea() {
		return 0.5*height*base;
	}
}
