

public class ex0419_4 {

	static void separateString() {
		String inStr = "c910m6ia 1ho";
		String alphaStr = new String();
		String numStr = new String();
		
		for (int i = 0; i < inStr.length(); i++ ) {
			if ( (inStr.charAt(i) >= '0') && (inStr.charAt(i) <= '9') ) 
				numStr += inStr.charAt(i);
			else if ( (inStr.charAt(i) >= 'a') && (inStr.charAt(i) <= 'z') ) 
				alphaStr += inStr.charAt(i);
		}
		
		System.out.println("alpha string : " + alphaStr);
		System.out.println("number string : " + numStr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		separateString();
	}

}
