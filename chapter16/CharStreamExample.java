package home;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExample {

	public static void main(String[] args) throws IOException {
		//문자열 변수 orgFilename에 원본파일 저장
		//문자열 변수 copiedFilename에 복사할 파일 이름 저장
		String orgFilename = "D1_Student.txt";
		String copiedFilename = "D1_Student_copied.txt";
		
		//try catch로 예외가 발생하지 않을때 try, 예외발생은 catch에서 처리
		//catch block에서 처리하는 예외는 파일이 지정된 경로에 없는경우 처리
		//입출력 예외는 throws로 던짐
		try {
			//FileReader 객체 fr 생성 원본파일 읽기
			//FileWriter 객체 fw 생성 복사본에 파일 쓰기 
			FileReader fr = new FileReader(orgFilename);
			FileWriter fw = new FileWriter(copiedFilename); 
			
			//copyCharData method에 FileReader 객체인 fr, FileWriter 객체인 fw를 매개변수로 지정
			copyCharData(fr, fw);
			//copyCharArrData(fr, fw);
			
			//fw.flush로 출력스트림에 남아있는 데이터 모두 출력
			//출력 후 close를 통해 입출력 스트림 자원 반환
			fw.flush();
			fw.close();
			fr.close();
			System.out.println(orgFilename + " 복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}
	//파일을 한번에 여러 문자씩 배열로 읽고 쓰는 method
	//100개의 문자를 저장할 수 있는charArrData배열 생성
	//fr.read에서 charArrData를 매개변수로 주면 최대 100개의 문자를 읽어서 배열에 저장
	//파일의 끝(-1)이 아니라면 System.out.print로 읽어온 문자를 출력하고
	//fw.write로 해당 문자를 출력스트림에 씀
	private static void copyCharArrData(FileReader fr, FileWriter fw) throws IOException {
		char[] charArrData = new char[100];
		while (fr.read(charArrData) != -1) {
			System.out.print(charArrData);
			fw.write(charArrData);
		}
		
	}

	//파일을 한 문자씩 읽고 쓰는 method
	//fr.read로 파일에서 한문자를 읽어서 charData에 저장
	//파일의 끝(-1)이 아니라면 System.out.print로 읽어온 문자를 출력하고
	//fw.write로 해당 문자를 출력스트림에 씀
	private static void copyCharData(FileReader fr, FileWriter fw) throws IOException {
		int charData;
		while ((charData = fr.read()) != -1) {
			System.out.print((char)charData);
			fw.write(charData);
		}
	}

}
