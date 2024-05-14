package exception;

public class MultiCatchTest {

	public static void main(String[] args) {
		System.out.println("=== 프로그램 시작 ===");
		
		String[] array = {"100", "1oo"};
		
		for (int i = 0; i <= array.length; i++) {
				try {
					int value = Integer.parseInt(array[i]);
					System.out.println("array[" + i + "]의 value = " + value);
				} catch (NumberFormatException e) {
					System.out.println(array[i] + "는 숫자가 아닌 문자입니다. "+ e.toString());
				} catch(ArrayIndexOutOfBoundsException e) {
					System.out.println(e.toString());
					
				}
		}
		
		System.out.println("=== 프로그램 종료 ===");

	}

}
