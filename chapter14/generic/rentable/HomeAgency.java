package generic_class.rentable;

public class HomeAgency implements Rentable<Home> {
	public Home rent() {
		System.out.println("집을 렌트했습니다.");
		return new Home();
	}
}
