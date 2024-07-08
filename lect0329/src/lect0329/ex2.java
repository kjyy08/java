package lect0329;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요 : ");
		int year = sc.nextInt();
		if ( (2024 - year) >= 18 ) 
			System.out.println("성년");
		else
			System.out.println("미성년");
		sc.close();
	}

}
