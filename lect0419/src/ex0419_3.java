

public class ex0419_3 {

	static void calcSum() {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (((i%4) == 0) || ((i%7) == 0)) {
				sum += i;
			}
		}
		
		System.out.println("4와 7의 배수 합 : " + sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcSum();
	}

}
