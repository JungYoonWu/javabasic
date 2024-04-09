package chap04;

public class Member03 {
	//private으로 변수 만들기
	private String name;
	private String id;
	private String password;
	private int age;
	
	//회원정보를 가지고 생성자 설정
	public Member03(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	//회원이름의 접근자
	public String getName() {
		return name;
	}
	//회원이름의 설정자
	public void setName(String name) {
		this.name = name;
	}
	//회원아이디의 접근자
	public String getId() {
		return id;
	}
	//회원아이디의 설정자
	public void setId(String id) {
		this.id = id;
	}
	//회원비밀번호의 접근자
	public String getPassword() {
		return password;
	}
	//회원비밀번호의 설정자
	public void setPassword(String password) {
		this.password = password;
	}
	//회원나이의 접근자
	public int getAge() {
		return age;
	}
	//회원나이의 설정자
	public void setAge(int age) {
		this.age = age;
	}
	
}
