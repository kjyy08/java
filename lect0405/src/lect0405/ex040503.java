package lect0405;

import java.util.Scanner;

public class ex040503 {

	static void randomGuess() {
		int[] ranNum = new int[5];
		int i,j,cnt;
		int[] n = new int[5];
		
		Scanner sc = new Scanner(System.in);
		cnt = 0;
		
		while ( cnt < 5 ) {
			for ( i = 0; i < 5; i++ )
				ranNum[i] = getRandomNo();
			System.out.println("5개의 숫자를 입력하세요 :");
			n[0] = sc.nextInt();
			if ( n[0] == -1)
				break;	
			n[1] = sc.nextInt();
			n[2] = sc.nextInt();
			n[3] = sc.nextInt();
			n[4] = sc.nextInt();		

			for ( i = 0; i < 5; i++ ) {
				for ( j = 0; j < 5; j++ ) {
					if ( n[i] == ranNum[j]) {
						cnt++;
						break;
					}
				}
			}
			if ( cnt == 5 ) {
				System.out.print("정답을 전부 찾았습니다. 정답은  : " );
				for ( i = 0; i < 5; i++ ) 
					System.out.print(ranNum[i] + " " );
				System.out.println(" ");
			}
			else {
				System.out.print("정답을 찾지 못했습니다. 중단하려면 -1 을 입력하세요. 정답은  : " );
				for ( i = 0; i < 5; i++ ) 
					System.out.print(ranNum[i] + " " );
				System.out.println(" ");
			}
			cnt = 0;
		}
		sc.close();
	}
	
	static int getRandomNo() {
		return( (int)((Math.random() * 10) % 9) ); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		randomGuess();
	}

}
