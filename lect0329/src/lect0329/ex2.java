package lect0329;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();
		if ( (2024 - year) >= 18 ) 
			System.out.println("����");
		else
			System.out.println("�̼���");
		sc.close();
	}

}
