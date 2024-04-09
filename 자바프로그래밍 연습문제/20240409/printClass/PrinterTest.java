package chap04;

class Printer{
	int numOfPapers = 0;
	
	public void print(int amount) {
		//if(amount>numOfPapers)
		numOfPapers -= amount;
	}
}


public class PrinterTest {

	public static void main(String[] args) {
		Printer pt = new Printer();
		pt.numOfPapers = 100;
		pt.print(70);
		System.out.println(pt.numOfPapers);

	}

}
