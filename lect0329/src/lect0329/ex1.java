package lect0329;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		String str = sc.nextLine();
		if ( str.length() > 5 ) 
			System.out.println("�幮");
		else
			System.out.println("�ܹ�");
		sc.close();
	}

}
