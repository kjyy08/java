package lect0412;

import java.util.Scanner;

public class lect0412_1 {

	static void exString() {
		int i,j;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("영문으로 한문장을 입력하세요 : ");
		String inStr = sc.nextLine();
		sc.close();
		
		System.out.println("lower case : " + inStr.toLowerCase());
		
		int cnt = 0;
		for ( i = 0; i < inStr.length(); i++ ) {
			if ( inStr.charAt(i) == ' ' )
				cnt++;
		}
		System.out.println("black count : " + cnt);
		
		String inStr2 = inStr.replace(" ", "");
		int[] chCount = new int[inStr2.length()];
		for ( i = 0; i < inStr2.length(); i++ ) {
			chCount[i] = 0;
			for ( j = i; j < inStr2.length(); j++ ) {
				if ( inStr2.charAt(i) == inStr2.charAt(j))
					chCount[i]++;
			}
		}
		int maxPtr = 0;
		for ( i = 0; i < inStr2.length(); i++ ) {
			if ( chCount[i] > maxPtr )
				maxPtr = i;
		}
		System.out.println("Max frequent char : " + inStr2.charAt(maxPtr) + ", count : " + chCount[maxPtr]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exString();
	}

}
