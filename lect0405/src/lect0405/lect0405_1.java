package lect0405;

public class lect0405_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		
		int[] myVar = new int[5];
		myVar[0] = 10;
		myVar[1] = 20;
		myVar[2] = 30;
		myVar[3] = 40;
		myVar[4] = 50;
		
		for ( i = 0; i < 5; i++ )
			myVar[i] = 10 * (i+1);
		
		int[] myVar1 = { 10,20,30,40,50 };
		
		int[][] myVar2 = new int[3][4];
		
		for ( i = 0; i < 3; i++ ) {
			for ( j = 0; j < 4; j++ ) {
				myVar2[i][j] = 10;
			}
		}
		// i = 0, j = 0,1,2,3
		// i = 1, j = 0,1,2,3
		// i = 2, j = 0,1,2,3
		
		int[][] myVar3 = { {1,2,3},{4,5,6},{7,8,9}}; // new int[3][3]
	}

}
