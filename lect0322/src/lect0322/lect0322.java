package lect0322;

public class lect0322 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		sum = 10;
		System.out.print("sum : " + (sum + 10) + "  \n");
		System.out.println("sum : " + (sum + 20));
		
		String name = "Suwon";
		System.out.println("name : " + name);
		
		boolean myFlag =  false;
		System.out.println("myFlag : " + myFlag);
		
		if ( myFlag ) {
			System.out.println("myFlag : true");
		}
		else {
			System.out.println("myFlag : false");
		}
		
		System.out.printf("sum is %d, name = %s\n", sum, name);
	}

}
