package chap04;

public class PrinterTest2 {

	public static void main(String[] args) {
		Printer2 demoPrinter1 = new Printer2(50);
		demoPrinter1.print(20);
		demoPrinter1.print(20);
		demoPrinter1.print(20);
		
		Printer2 demoPrinter2 = new Printer2(60);
		demoPrinter2.print(13,"양면");
		demoPrinter2.print(33,"양면");
		demoPrinter2.print(100,"양면");
	}

}


class Printer2 {
	private int numOfPapers = 0;
	
	Printer2(int numOfPapers){
		this.numOfPapers = numOfPapers;
	}
	
	void print(int amount) {
		if(paperEmpty()) {
			System.out.println("용지가 없습니다.");
		}else if(paperEnough(amount)) {
			this.numOfPapers -= amount;
			System.out.println(amount + "장 출력했습니다. 현재 " + numOfPapers + "장 남았습니다.");
		}else {
			System.out.println("프린트 하기 위해서는" + (amount - numOfPapers) +"장 부족합니다."
					+numOfPapers+ "장만 출력됐습니다.");
			this.numOfPapers = 0;
		}
		
		
	}
	
	void print(int amount, String bothSide) {
		boolean printBoth = bothSide=="양면";
		
		amount = (amount%2==0)?amount/2:amount/2+1;
		if(paperEmpty()) {
			System.out.println("용지가 없습니다.");
		}else if(paperEnough(amount)) {
//			amount = (amount%2==0)?amount/2:amount/2+1;
			this.numOfPapers -= amount;
			System.out.println(amount+"장 출력했습니다. 현재 "+numOfPapers +"장 남았습니다.");
		}else {
			System.out.println("프린트 하기 위해서는"+(amount-numOfPapers)+"장 부족합니다."
					+numOfPapers+"장 출력했습니다.");
			this.numOfPapers = 0;
		}
		
	}
	public int getNumOfPapers() {
		return numOfPapers;
	}

	// amount = (amount%2==0)?amount/2:amount/2+1;
	boolean paperEmpty() {
		return numOfPapers == 0;
	}
	
	boolean paperEnough(int amount) {
		return numOfPapers-amount>=0;
	}
}
