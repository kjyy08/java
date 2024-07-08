package lect0329;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력하세요 : ");
		String str = sc.nextLine();
		if ( str.length() > 5 ) 
			System.out.println("장문");
		else
			System.out.println("단문");
		sc.close();
	}

}
