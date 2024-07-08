package lect0607;

import java.io.File;
import java.io.FileInputStream;

public class ex0607_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("example03.txt");
			if (!file.exists())
				file.createNewFile();

			FileInputStream fis = new FileInputStream(file);
			int i = 0;

			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}

			fis.close();
			System.out.println("\n?åå?ùº ?ùΩÍ∏? ?Ñ±Í≥?");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
