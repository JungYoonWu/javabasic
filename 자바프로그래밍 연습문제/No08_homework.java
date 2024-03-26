package Chapter02_Home_0326;

public class No08_homework {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		
	}
	
	static int factorial(int n) {
		return switch (n) {
		case 0 -> 1;
			
		case 1 -> 1;
		default -> n*factorial(n-1);
		
		};
	}

}
