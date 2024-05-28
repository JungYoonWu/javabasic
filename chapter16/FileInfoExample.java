package home; 

import java.io.File; 
import java.io.IOException; 

public class FileInfoExample { 

    public static void main(String[] args) throws IOException { 
    	//imgDir 객체를 생성하여 "C:/Temp/images" 디렉토리를 나타냄
    	//testFile 객체를 생성하여 "C:/Temp/test.txt" 파일을 나타냄
        File imgDir = new File("C:/Temp/images"); 
        File testFile = new File("C:/Temp/test.txt"); 

        //imgDir 디렉토리가 존재하지 않으면,
        //imgDir.mkdirs()를 호출하여 필요한 모든 상위 디렉토리를 포함하여 디렉토리를 생성
        //생성 후, 디렉토리 이름을 출력
        if (imgDir.exists() == false) { 
            imgDir.mkdirs(); 
            System.out.println(imgDir.getName() + "을 생성합니다."); 
        }
        
        //testFile 파일이 존재하지 않으면,
        //testFile.createNewFile()을 호출하여 파일을 생성
        //생성 후, 파일 이름을 출력
        if (testFile.exists() == false) { 
            testFile.createNewFile(); 
            System.out.println(testFile.getName() + "을 생성합니다."); 
        }

        
        //tempDir 객체를 생성하여 "C:/Temp" 디렉토리를 나타냄
        //tempDir.listFiles()를 호출하여 해당 디렉토리의 내용을 contents 배열에 저장
        //tempDir 디렉토리의 내용을 출력한다고 알리는 메시지를 출력
        File tempDir = new File("C:/Temp"); 
        File[] contents = tempDir.listFiles(); 
        System.out.println(tempDir.getName() + "의 내용을 출력합니다."); 
        
        //foreach문으로 contents 배열에 있는 각 파일 및 디렉토리를 반복
        //현재 파일 또는 디렉토리의 이름을 출력
        //현재 파일이 디렉토리인 경우 <DIR>을 출력
        //현재 파일이 파일인 경우 파일의 크기를 출력
        for (File file : contents) { 
            System.out.print("\t" + file.getName()); 
            if (file.isDirectory()) { 
                System.out.print("<DIR>"); 
            } else { 
                System.out.print("<" + file.length() + ">"); 
            }
            System.out.println(); 
        }
    }
}
