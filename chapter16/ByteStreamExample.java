package home;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

	public static void main(String[] args) throws IOException {
		//문자열 변수 orgFilename에 원본파일 저장
		//문자열 변수 copiedFilename에 복사할 파일 이름 저장
		String orgFilename = "Curi_01.jpg";
		String copiedFilename = "Curi_01_copied.jpg";
		
		//try catch로 예외가 발생하지 않을때 try, 예외발생은 catch에서 처리
		//catch block에서 처리하는 예외는 파일이 지정된 경로에 없는경우 처리
		//입출력 예외는 throws로 던짐
		try {
			//FileInputStream 객체 fis 생성 원본파일 읽기
			//FileOutputStream 객체 fos 생성 복사할 파일에 쓰기
			FileInputStream fis = new FileInputStream(orgFilename);
			FileOutputStream fos = new FileOutputStream(copiedFilename);
			
			//copyEachOneByte method에 FileInputStream 객체인 fis, FileOutputStream 객체인 fos를 매개변수로 지정
			copyEachOneByte(fis, fos);
			//copyEachKByte(fis, fos);
			
			//fos.flush로 출력스트림에 남아있는 데이터를 모두 출력
			//출력 후 close를 통해 입출력 스트림 자원 반환
			fos.flush();
			fos.close();
			fis.close();
			System.out.println("복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}	
	}
	
	//파일을 1byte 씩 읽고 쓰는 method
	//FileInputStream 객체 fis의 method인 read()를 사용해서 파일에서 1byte씩 읽어서 byteInput에 저장
	//파일의 끝(-1)이 될때까지 계속 읽고 읽은 byte를 FileOutputStream 객체인 fos객체에 write로 출력스트림에 씀
	private static void copyEachOneByte(FileInputStream fis, FileOutputStream fos) throws IOException {
		int byteInput;
		while ((byteInput = fis.read()) != -1) {
			fos.write(byteInput);
		}
	}
	
	//파일을 1KB씩 읽고 쓰는 method
	//byte[] kbInput배열의 크기는 1024로 1KB
	//파일에서 최대 1KB를 읽어서 kbInput에 저장하고 그 저장된 값을 write로 출력스트림에 씀
	private static void copyEachKByte(FileInputStream fis, FileOutputStream fos) throws IOException {
		byte kbInput[] = new byte[1024];
		while (fis.read(kbInput) != -1) {
			fos.write(kbInput);
		}
	}

}
