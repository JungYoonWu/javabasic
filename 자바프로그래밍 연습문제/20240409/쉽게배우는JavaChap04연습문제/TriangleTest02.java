package chap04;

public class TriangleTest02 {

	public static void main(String[] args) {
		Triangle02 t1 = new Triangle02(10.0, 5.0);
		Triangle02 t2 = new Triangle02(5.0, 10.0);
		Triangle02 t3 = new Triangle02(8.0, 8.0);
		
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}

}
