package lect0405;

public class ex040502 {
	static void calcMain() {
		System.out.println("10 + 10 = " + add(10,10));
		System.out.println("10 -  5 = " + subtract(10,5));
		System.out.println("10 *  5 = " + multiply(10,5));
		System.out.println("10 /  5 = " + divide(10,5));
	}
	static int add(int x, int y) {
		return (x + y);
	}
	static int subtract(int x, int y) {
		return (x - y);
	}
	static int multiply(int x, int y) {
		return (x * y);
	}
	static int divide(int x, int y) {
		if ( y == 0 ) {
			System.out.println("Do not divide by 0");
			return -1;
		}
		else {
			return ( x / y);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcMain();
	}

}
