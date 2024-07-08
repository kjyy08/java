package lect0405;

import java.util.Scanner;

public class ex040501 {
	
	static void calcMain() {
		Scanner sc = new Scanner(System.in);
		System.out.println("월급을 입력하세요 : ");
		int salary = sc.nextInt();
		sc.close();	
		System.out.println("연봉액은 : " + calcSalary(salary) + " 입니다.");
	}
	
	static int calcSalary(int salary) {
		int anualSalary = (salary * 12) + (salary * 5);
		return anualSalary;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcMain();
	}

}
