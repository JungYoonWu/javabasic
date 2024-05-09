package chapter07;
abstract class Controller {

	boolean power;
	
	 public Controller(boolean power){
	        this.power = power;
	    }
	
	void show() {
		if(power) {
			System.out.println(getName() + "가 켜졌습니다.");
		} else {
			System.out.println(getName() + "가 꺼졌습니다.");
		}
	}

	abstract String getName();

}

class TV extends Controller {
	
	boolean power = false;

	TV(boolean power) {
		super(power);
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "TV";
	}
}


class Radio extends Controller {
	
	boolean power = false;

	Radio(boolean power) {
		super(power);
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "라디오";
	}
}
public class Ex05 {

	public static void main(String[] args) {

		Controller[] c = { new TV(false), new Radio(true) };

		for (Controller controller : c)
			controller.show();

	}

}




