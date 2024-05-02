package _06Challenge;

public class Programing02 {

	public static void main(String[] args) {
		Person[] person = {new Person("길동이", 22), new Student("황진이", 23, 100), new ForeignStudent("AMY", 30, 200, "U.S.A")};
		
		for(Person p : person) {
			System.out.println(p.show());
		}
	}
	
	static class Person{
		String name;
		int age;
		String show() {
			return "사람[이름 : " + name + ", 나이 : " + age + "]";
		}
		
		String getName() {
			return name;
		}
		int getAge() {
			return age;
		}
		
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}
	
	static class Student extends Person{
		int number;
		
		public Student(String name, int age, int number) {
			super(name, age);
			this.number = number;
		}
		
		int getNumber() {
			return number;
		}
		
		String show() {
			return "학생[이름 : " + name + ", 나이 : " + age +", "+ "학번 : " + number + "]";
		}
	}
	
	static class ForeignStudent extends Student{
		String citizenship;
		
		public ForeignStudent(String name, int age, int number, String citizenship) {
			super(name, age, number);
			this.citizenship = citizenship;
		}
		
		String getCitizenship() {
			return citizenship;
		}
		
		String show() {
			return "외국학생[이름 : " + name + ", 나이 : " + age +", "+ "학번 : " + number +", " + "국적 : " + citizenship + "]";
		}
		
	}

}
