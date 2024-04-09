package chap04;

public class Triangle02 {
	private double height;	//필드에 있는 맴버변수 private 높이, 밑변
	private double base;
	public double getHeight() {
		return height;
	}
	public double getBase() {
		return base;
	}
	
	
	Triangle02(double height, double base){//Triangle 객체를 만들때 필요한 높이와밑변값을 생성자로 받는다.
		this.height = height;
		this.base = base; 
	}
	public double findArea() {
		return 0.5*height*base;
	}
	
	public boolean isSameArea(Triangle02 t) {
		//파라미터로 받은 Triangle객체에서의 findArea값과 비교하려고 하는 객체의 넓이값을 비교하기 위해서 this사용
		return this.base*this.height*0.5 == t.findArea();
	}
}
