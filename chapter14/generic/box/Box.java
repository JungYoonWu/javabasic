package generic_class.box;

public class Box<T> {

	private T content;
	public T getContent() {
		return content;
	}
	
	public void setContent(T content) {
		this.content = content;
	}
	
}