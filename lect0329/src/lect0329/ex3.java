package lect0329;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for ( int i = 1;i <= 10 ;i++ )
//			System.out.println(i + " ");
//		
		int k = 1;
		while ( k < 100 ) {
			System.out.println("index : " + k);
			if ( (k > 40) && (k < 55)) {
				k++;
				continue;
			}
			
			if ( k > 20 ) 
				k += 2;
			else
				k++;
			if ( k == 89 )
				break;
		}
//		Scanner sc = new Scanner(System.in);
//		int year = 0;
//		do {
//			System.out.println("년도를 입력하세요 : ");
//			year = sc.nextInt();
//		} while ( year < 2024);
//		
//		sc.close();
		
	}

}
