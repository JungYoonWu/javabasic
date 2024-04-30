package phone;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

		//Phone으로부터 상속받은 필드 읽기
		System.out.println("모델: " + myPhone.model);//model,color는 자식클래스에 안보이지만 상속받았기 때문에 사용 가능
		System.out.println("색상: " + myPhone.color);

		//SmartPhone의 필드 읽기
		System.out.println("와이파이 상태: " + myPhone.wifi); //wifi는 자식클래스에 있는 필드값

		//Phone으로부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요.");
		myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		myPhone.sendVoice("아~ 네, 반갑습니다.");
		myPhone.hangUp();
		
		//SmartPhone의 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
	}
}