

import java.util.Scanner;

public class ex0419_2 {

	static void printGuGuDan(int dan) {
		for ( int i = 1; i <= 9; i++ ) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dan = 0;
		while ( true)  {
			System.out.println("Enter Dan value : ");
			dan = sc.nextInt();
			if ( dan == -1 )
				break;
			if ( (dan < 2) || (dan > 9))
				continue;
			printGuGuDan(dan);
		}
		System.out.println("Completed... ");
		sc.close();
	}

}
