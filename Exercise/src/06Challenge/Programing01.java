package _06Challenge;

public class Programing01 {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Circle c2 = new ColoredCircle(10, "빨간색");
		
		c1.show();
		c2.show();
	}

	
	static class Circle{
		int radius;
		
		public Circle(int radius){
			this.radius = radius;
			}
		
		void show() {
			System.out.printf("반지름이 %d인 원이다 \n", radius);
		}
	}
	
	static class ColoredCircle extends Circle{
		String color;
		
		void show() {
			System.out.println("반지름이 "+ radius +"인 " + color +"원이다");
		}
		
		public ColoredCircle(int radius, String color) {
			super(radius);
			this.color = color;
		}
	}
}
