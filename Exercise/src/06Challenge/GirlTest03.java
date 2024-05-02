package _06Challenge;

public class GirlTest03 {

	public static void main(String[] args) {
		Girl[] girls = {new Girl("갑순이"),
						new Girl("콩쥐"),
						new Girl("황진이")};
		
		for(Girl g : girls) {
			g.show();
		}
		
	}
	
	static class Girl{
		protected String name;
		Girl(String name){
			this.name = name;
		}
		void show() {
			System.out.println(name+"는 자바 초보다.");
		}
	}
	
	static class GoodGirl extends Girl{
		GoodGirl(String name){
			super(name);
		}
		void show() {
			System.out.println(name+"는 자바를 잘 안다.");
		}
	}
	
	static class BestGirl extends GoodGirl{
		BestGirl(String name){
			super(name);
		}
		void show() {
			System.out.println(name+"는 자바를 무지하게 잘 안다.");
		}
	}

}
