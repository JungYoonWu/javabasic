package chap04;

//import java.util.Random;

public class Dice08 {
	private int face;
	
	public Dice08() {
		this.face = face;
	}
	
	public int roll() {
		//math로 받는법 Random객체로 받는법 두개 나옴
//		Random rand = new Random();
//		face = rand.nextInt(6)+1;
		this.face =(int)((Math.random()*10)%6+1);
		
		return face;
	}
}
