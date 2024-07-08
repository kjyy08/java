package lect0607;

import java.io.File;
import java.io.IOException;

public class ex0607_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fileObj = new File("example01.txt");
		
		if ( fileObj.exists() ) {
			System.out.println("파일 있음");
		}
		else {
			System.out.println("파일 없음");
		}
		try {
			boolean success = fileObj.createNewFile();

			if (success) {
				System.out.println("파일 생성 성공");
			} else {
				System.out.println("파일 생성 실패");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
