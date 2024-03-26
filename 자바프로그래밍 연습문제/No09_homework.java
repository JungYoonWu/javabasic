package Chapter02_Home_0326;

public class No09_homework {

	public static void main(String[] args) {
		foo("안녕", 1);
		foo("안녕하세요", 1, 2);
		foo("잘 있어");
	}

	static void foo(String message, int a, int b) {
		System.out.println(message + " " + a + " "+ b);
	}
	
	static void foo(String message, int a) {
		System.out.println(message + " " + a);
	}
	
	static void foo(String message) {
		System.out.println(message);
	}
	
}
