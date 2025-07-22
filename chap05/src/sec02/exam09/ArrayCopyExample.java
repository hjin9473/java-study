package sec02.exam09;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayCopyExample {
	public static void main(String[] args) {
		// 2. System.arraycopy() 메소드 이이ㅛㅇ
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		
//		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		// src: 복사할 원본 배열
		// srcPos: 원본 배열에서 복사할 위치
		// dest: 붙여넣을 대상 배열
		// destPos: 대상 배열에 붙여넣을 위치
		// length: 몇 개를 복사할지
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		
		System.out.println();
		
		// 3.Arrays.copyOf() 메소드 사용
		
		String[] newStrArray2 = Arrays.copyOf(oldStrArray, oldStrArray.length + 2);
		for (int i = 0; i < newStrArray2.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		
		
		
	}
}
