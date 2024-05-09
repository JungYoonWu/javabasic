package generic_class.rentable;

public class CarAgency implements Rentable<Car>{
	public Car rent() {
		System.out.println("자동차를 렌트했습니다.");
		return new Car();
	}
}
