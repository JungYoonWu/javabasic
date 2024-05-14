package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest {
	public static void main(String[]agrs) {
		//arithmeticException();
		//indexException();
		//nullPointerException();
		//numberFormatException();
		//ioException();
	}
	public static void arithmeticException() {
		int a = 10, b= 0;
		int c = a/b;
	}

	public static void indexException() {
		int[] array = { 0, 1, 2 };
		System.out.println(array[3]);
	}

	public static void nullPointerException() {
		String str = null;
		str.charAt(1);
	}

	public static void numberFormatException() {
		String str = "123AA";
		int num = Integer.parseInt(str);
	}

	public static void ioException() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
}

	public static void classException() {
//		Class.forName("java.lang.String");
		System.out.println("클래스가 있습니다.");
	}
}
