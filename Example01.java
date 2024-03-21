package chatper08;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArr1 = new int[5];
		myArr1[0] = 10;
		myArr1[1] = 20;
		myArr1[2] = 30;
		myArr1[3] = 40;
		myArr1[4] = 50;
		
		System.out.println("myArr1 요소값");
		for(int i = 0; i<myArr1.length; i++) {
			System.out.println(i + "번째 요소값 : " + myArr1[i]);
		}
	
		int[] myArr2 = {10,20,30,40,50};
		System.out.println("myArr2 요소값");
		for(int i = 0; i<myArr2.length; i++) {
			System.out.println(i + "번째 요소값 : " + myArr2[i]);
		}
		System.out.println(myArr2.length);
	}

}
