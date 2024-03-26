package Chapter02_Home_0326;

public class No05_homework {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++ ) {
			for(int j = 1; j < 10; j++) {
				for(int k = 1; k < 10; k++) {
					if((i*i)+(j*j) == (k*k)  && i+j+k <= 20) {
						System.out.print("i = " + i +" j = " + j +" k = "+ k);
						System.out.println();
					}
				}
			}
		}
	}

}
