package chatper08;

public class Array01 {

	public static void main(String[] args) {
		double[] gradeArr = {90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7};
		
		double sum = 0;
		double average = 0;
		for(int i = 0; i<gradeArr.length; i++) {
			sum = sum + gradeArr[i];
		}
		
		average = sum/gradeArr.length;
		System.out.println("합계 : "+ sum);
		System.out.println("평균 : " + average);

	}

}
