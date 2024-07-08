package lect0405;

import java.util.Scanner;

public class lect0405 {

	static boolean getLeapYear(int year){
		if (((year%4 == 0) && (year%100 != 0))|| (year%400 == 0)){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		boolean leapYear = false;
		int totaldays = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("연월일을 입력하세요 : ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		sc.close();
		
		for ( i = 1900; i < year; i++ ) {
			if (getLeapYear(i)){
				totaldays += 366;
			}
			else {
				totaldays += 365;
			}
		}
		
		if (getLeapYear(year)){
			leapYear = true;
		}
		
		int[] mDays = { 31,28,31,30,31,30,31,31,30,31,30,31 };
		for ( i = 0; i < (month-1); i++ ) {
			if ( i == 1 ) {
				if ( leapYear ) 
					totaldays += 29;
				else
					totaldays += 28;
			}
			else 
				totaldays += mDays[i];
//			switch ( i ) {
//			case 0:		//	1월
//			case 2:		//	3월
//			case 4:		//	5월
//			case 6:		//	7월
//			case 7:		//	8월
//			case 9:		//	10월
//			case 11:	//	12월
//				totaldays += 31;
//				break;
//			case 1:		//	2월
//				if ( leapYear ) 
//					totaldays += 29;
//				else
//					totaldays += 28;
//				break;
//			case 3:		//	4월
//			case 5:		//	6월
//			case 8:		//	9월
//			case 10:	//	11월
//				totaldays += 30;
//				break;
//			}
		}

		totaldays += day - 1;
		System.out.println("총 날수는 " + totaldays);
	}

}
