package lect0329;

import java.util.Scanner;

public class lect0329 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("이름을 입력하세요 : ");
//		String name = sc.nextLine();
//		System.out.println("학과를 입력하세요 : ");
//		String dept = sc.nextLine();
//		System.out.println("학년을 입력하세요 : ");
//		int grade = sc.nextInt();
//		System.out.println(name + "은 " + dept + " 학과 " + grade + " 학년입니다");
		System.out.println("3과목 성적을 입력하세요 : ");
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		int score3 = sc.nextInt();
		
		int total = score1 + score2 + score3;
		double average = total /  3.0;
		
		System.out.println("total : " + total + ", average : " + average);
		sc.close();
	}

}
