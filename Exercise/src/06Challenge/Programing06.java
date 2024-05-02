package _06Challenge;

public class Programing06 {

	public static void main(String[] args) {
		Car car = new Car("파랑", 200, 1000, 5);
		car.show();
		
		System.out.println();
		Vehicle vehicle = car;
		vehicle.show();
	}
	static class Vehicle{
		String color;
		int speed;
		public Vehicle(String color, int speed) {
			this.color = color;
			this.speed = speed;
		}
		void show() {
			System.out.printf("자동차 색깔 : %s\n자동차 속도 : %d\n", color, speed);
		}
		
	}
	
	static class Car extends Vehicle{
		int displacement;
		int gears;
		public Car(String color, int speed, int displacement, int gears) {
			super(color, speed);
			this.displacement = displacement;
			this.gears = gears;
		}
		void show() {
			System.out.printf("자동차 색깔 : %s\n자동차 속도 : %d\n자동차 배기량 : %d\n자동차 기어 : %d\n", color, speed, displacement, gears);
		}
	}
}
