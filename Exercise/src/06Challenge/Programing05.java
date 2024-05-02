package _06Challenge;

public class Programing05 {

	public static void main(String[] args) {
		Phone[] phone = {new Phone("황진이"), new Telephone("길동이", "내일"),
						 new Smartphone("민국이", "갤러그")};
	
		for(Phone p : phone) {
			if(p instanceof Smartphone) {
				((Smartphone) p).playGame();
			}else if(p instanceof Telephone) {
				((Telephone) p).autoAnswering();
			}else if(p instanceof Phone) {
				p.talk();
			}
		}
	}
	static class Phone {
		protected String owner;
		
		public Phone(String owner) {
			this.owner = owner;
		}
		
		void talk() {
			System.out.println(owner+"가 통화 중");
		}
	}
	
	static class Telephone extends Phone{
		private String when;
		public Telephone(String owner, String when) {
			super(owner);
			this.when = when;
		}
		public Telephone(String owner) {
			super(owner);
		}
		
		void autoAnswering() {
			System.out.println(owner+"가 부재 중이니 "+ when + "에 전화 요망");
		}
	}
	
	static class Smartphone extends Telephone{
		String game;
		public Smartphone(String owner, String game) {
			super(owner);
			this.game = game;
		}
		void playGame() {
			System.out.println(owner + "가 " + game + "게임을 하는 중이다.");
		}
	}
}
