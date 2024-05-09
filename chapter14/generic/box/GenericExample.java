package generic_class.box;
public class GenericExample {
	
	public static void main(String[] args) {
		
		Box<String> box1 = new Box<>();
		box1.setContent("안녕하세요.");
		String str = box1.getContent();
		System.out.println("String Box : " + str);

		Box<Integer> box2 = new Box<>();
		box2.setContent(100);
		int value = box2.getContent();
		System.out.println("Integer Box : " + value);
		
	}
	
}