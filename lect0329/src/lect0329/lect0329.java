package lect0329;

import java.util.Scanner;

public class lect0329 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("�̸��� �Է��ϼ��� : ");
//		String name = sc.nextLine();
//		System.out.println("�а��� �Է��ϼ��� : ");
//		String dept = sc.nextLine();
//		System.out.println("�г��� �Է��ϼ��� : ");
//		int grade = sc.nextInt();
//		System.out.println(name + "�� " + dept + " �а� " + grade + " �г��Դϴ�");
		System.out.println("3���� ������ �Է��ϼ��� : ");
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		int score3 = sc.nextInt();
		
		int total = score1 + score2 + score3;
		double average = total /  3.0;
		
		System.out.println("total : " + total + ", average : " + average);
		sc.close();
	}

}
