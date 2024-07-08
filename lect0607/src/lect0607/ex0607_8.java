package lect0607;

import java.io.File;
import java.io.FileInputStream;

public class ex0607_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("gugudan.txt");
		try {
			if (!file.exists())
				file.createNewFile();

			FileInputStream fis = new FileInputStream(file);
			int i = 0;

			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}

			fis.close();
			System.out.println("?åå?ùº ?ùΩÍ∏? ?Ñ±Í≥?");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
