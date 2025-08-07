package sec01.exam07;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) throws Exception{
		// 데이터 도착지를 test7.txt 파일로 하는 문자 기반 파일 출력 스트림 생성
		Writer writer = new FileWriter("C:/Temp/test7.txt");
		
//		char a = 'A';
//		char b = 'B';
//		char c = 'C';
		char a = '가';
		char b = '나';
		char c = '다';
		
		// 한 문자씩 세번 출력
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush();
		writer.close();
		
	}

}
