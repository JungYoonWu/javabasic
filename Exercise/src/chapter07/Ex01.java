package chapter07;

abstract class Abstract {

	int i;

	Abstract(int i){
		this.i = i;
	}
	
	abstract void show();
}

class Concrete extends Abstract{ 
	 
	int j;

	Concrete(int i, int j){
		super(i);
		this.j = j;
		
	}
	
	void show() {
		System.out.println("i = " + i + ", j = " + j);
	}
}

public class Ex01 {

	public static void main(String[] args) {

		Concrete c = new Concrete(100, 50);
		c.show();

	}

}



