package _06Challenge;

public class Programing04 {

	public static void main(String[] args) {
		Parent parent = new Child();
		System.out.println(parent.name); // 필드는 자기꺼씀
		parent.print();
	}
	static class Parent{
		String name = "영조";
		
		void print() {
			System.out.println("나는 " + name + "이다.");
		}
	}
	
	static class Child extends Parent{
		String name = "사도세자"; 
		
		void print() {
			System.out.println("나는" + name + "이다.");
		}
	}
}
